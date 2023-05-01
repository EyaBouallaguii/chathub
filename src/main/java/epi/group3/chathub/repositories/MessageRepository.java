package epi.group3.chathub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import epi.group3.chathub.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
