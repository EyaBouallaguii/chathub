package epi.group3.chathub.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epi.group3.chathub.dataTransfertObject.ClassCommand;
import epi.group3.chathub.dataTransfertObject.StudentCommand;
import epi.group3.chathub.entities.Class;
import epi.group3.chathub.entities.Discussion;
import epi.group3.chathub.entities.Student;
import epi.group3.chathub.repositories.ClassRepository;
import epi.group3.chathub.repositories.StudentRepository;
import epi.group3.chathub.repositories.UserRepository;

@RestController
@RequestMapping("/api/class")
public class ClassApi {
    @Autowired
	ClassRepository repository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    UserRepository userRepository;
    
    @PostMapping
    public void createClass(@RequestBody ClassCommand command) {
    	Class cls=new Class();
    	cls.name=command.name;
    	
    	cls.students=studentRepository.findAllById(command.members);
    	Discussion disc=new Discussion();
    	
    	disc.members=userRepository.findAllById(command.members);
    	disc.name=command.name;
    	cls.disc=disc;
    	repository.save(cls);
    }
    public void addStudent(@RequestBody StudentCommand command) {
    	Student st=new Student();
    	st.firstName=command.firstName;
    	
    	
    	Class clas=repository .findById(command.classId).orElseThrow();
    	studentRepository.save(st);
    	
    	
    }
	
	
}
