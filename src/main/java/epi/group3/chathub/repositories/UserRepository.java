package epi.group3.chathub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import epi.group3.chathub.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
