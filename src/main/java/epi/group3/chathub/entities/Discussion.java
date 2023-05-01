package epi.group3.chathub.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Discussion {
	@Id
	@GeneratedValue
	public int id;
	@ManyToOne
	public User admin;
	@ManyToMany(mappedBy = "discs")
	public List<User>members;
	@OneToMany(mappedBy = "discussion")
	public List<Message>msgs;
	
	public String name;
	public String description;
	
	
	

}
