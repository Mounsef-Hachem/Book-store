package common.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import common.models.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	List<Person> findByFirstName(String firstName);
}
