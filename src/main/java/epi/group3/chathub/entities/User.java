package epi.group3.chathub.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class User {
	@Id
	@GeneratedValue
	Integer id;
	@ManyToMany
	public List<Discussion>discs;

	// declaration des variables
	public String role;
	public String firstName, lastName, email, adress,login, password;
	public int tel;
	public LocalDate birthDate;
	public boolean isBlocked;
    
	// declaration des constructreurs
    public User(){}
	public User(String role, String firstName, String lastName, String email, String adress, String password, int id,
			int tel, LocalDate birthDate) {
		super();
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adress = adress;
		this.password = password;
		this.id = id;
		this.tel = tel;
		this.birthDate = birthDate;
	}

	// declaration des methodes
	void signIn() {

	}

	void delateMessage() {

	}

	void blockStudent() {

	}
}
