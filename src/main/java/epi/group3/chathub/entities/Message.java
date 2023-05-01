package epi.group3.chathub.entities;

import java.time.LocalDateTime; // Import the LocalDateTime class

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

public class Message {

	// declaration des variables
	@Id
	@GeneratedValue
	public int id;
	public LocalDateTime dt;
	public String text;
	@ManyToOne
	public User author;
	@ManyToOne
	public Discussion discussion;

	// declaration des constructreurs
	public Message(){}
	Message(LocalDateTime dt, String text, User author) {
		this.dt = dt;
		this.text = text;
		this.author = author;
	}
	// declaration des methodes

	void publish() {

	}

	void insertFile() {

	}

	void insertPicture() {

	}
}
