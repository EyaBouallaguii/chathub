package epi.group3.chathub.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epi.group3.chathub.dataTransfertObject.DiscussionCommand;
import epi.group3.chathub.dataTransfertObject.MessageCommand;
import epi.group3.chathub.entities.Discussion;
import epi.group3.chathub.entities.Message;
import epi.group3.chathub.entities.User;
import epi.group3.chathub.repositories.DiscussionRepository;
import epi.group3.chathub.repositories.MessageRepository;
import epi.group3.chathub.repositories.UserRepository;

@RestController
@RequestMapping("/api/discussion")
public class DiscussionApi {
    @Autowired
    UserRepository userRepository;
	@Autowired
	DiscussionRepository discussionRepository;
	@Autowired
	MessageRepository messageRepository;
	@GetMapping("/user/{userid}")
	public List<Discussion>getUserDiscs(@PathVariable int userid){
		return userRepository.findById(userid).map(user->user.discs).orElseThrow();
	}
	@GetMapping("/{id}")
	public Discussion getDisc(@PathVariable int id){
		return discussionRepository.findById(id).orElseThrow();
	}
	@PostMapping
	public void createDiscussion(@RequestBody DiscussionCommand command ) {
		Discussion discussion=new Discussion();
		discussion.name=command.name;
		discussion.description=command.description;
		discussion.admin=userRepository.findById(command.userCreatedBy).orElseThrow();
		discussion.members=userRepository.findAllById(command.members);
		discussionRepository.save(discussion);
	}
	@PostMapping("/message/new")
	public void ceateMessage(@RequestBody MessageCommand command) {
		Message msg=new Message();
		msg.text=command.text;
		msg.author=userRepository.findById(command.author).orElseThrow();
		msg.discussion=discussionRepository.findById(command.discussion).orElseThrow();
		messageRepository.save(msg);
	}
	@PostMapping("/message/delete/{id}")
	public void deleteMessage(@PathVariable int id) {
		messageRepository.deleteById(id);
	}
	
	
}
