package epi.group3.chathub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<epi.group3.chathub.entities.Class, Integer> {

}
