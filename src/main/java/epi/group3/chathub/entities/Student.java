package epi.group3.chathub.entities;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity

public class Student extends User {
	// declaration des variables 
	@ManyToOne
	public Class studentClass;
	
	//declaration des constructreurs
    public Student(){}
	public Student(String role, String firstName, String lastName, String email, String adress, String password, int id,
			int tel, LocalDate birthDate,Class studentClass) {
		super(role, firstName, lastName, email, adress, password, id, tel, birthDate);
		this.studentClass=studentClass;
		// TODO Auto-generated constructor stub
	}

	//declaration des methodes
	
	void seeMessage (){
		
	}
	
	void sendMessage() {
		
	}
	void signUp() {
		
	}
	void signIn() {
		
	}
	void react() {
		
	}
	
    
}
