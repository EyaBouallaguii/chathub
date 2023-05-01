package epi.group3.chathub.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epi.group3.chathub.entities.Student;
import epi.group3.chathub.repositories.StudentRepository;


@RestController
@RequestMapping("/api/student")

public class StudentApi {
	@Autowired
	StudentRepository repository;
	@GetMapping
	public List<Student> getStudents(){
		
		return repository.findAll();
	}
	@PostMapping
	public void createStudent(@RequestBody Student newStudent) {
		repository.save(newStudent);
		
	}
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		repository.deleteById(id);
	}
    @GetMapping("/profil/{id}")
    public Student showProfil(@RequestBody int id) {
    	return repository.findById(id).orElseThrow();
    }
}
