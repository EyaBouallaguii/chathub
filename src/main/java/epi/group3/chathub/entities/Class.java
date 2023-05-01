package epi.group3.chathub.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity

public class Class {
	
	    // declaration des variables 
	@Id
	@GeneratedValue
	public int id;
	public String name;
	@OneToMany
	public List<Student> students;
	@OneToOne
	public Discussion disc;
	
	
		
		//declaration des constructreurs
		
		
		
		//declaration des methodes
	void createClass() {
		
	}
	void addStudent() {
		
	}
}
