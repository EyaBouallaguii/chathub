package epi.group3.chathub.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epi.group3.chathub.entities.User;
import epi.group3.chathub.repositories.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserApi {
    @Autowired
	UserRepository repository;
	@GetMapping
	public List<User> getUsers(){
		
		return repository.findAll();
	}
	@PostMapping
	public void createUser(@RequestBody User newUser) {
		repository.save(newUser);
		
	}
	 
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		repository.deleteById(id);
	}
	@PostMapping("/{id}")
	public void block(@PathVariable int id) {
		User user=repository.findById(id).orElseThrow();
		user.isBlocked=true;
		repository.save(user);
	}
	
} 
