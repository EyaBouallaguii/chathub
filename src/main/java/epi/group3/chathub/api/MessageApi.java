package epi.group3.chathub.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epi.group3.chathub.entities.Message;
import epi.group3.chathub.repositories.MessageRepository;
@RestController
@RequestMapping("/api/message")
public class MessageApi {
	@Autowired
	MessageRepository repository;
	@GetMapping
	public List<Message> getMessage(){
		
		return repository.findAll();
	}
	
	
}
