package api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import common.models.Person;
import common.repositories.PersonRepository;

@RestController
public class TestController {

	@Autowired
	private PersonRepository personRepository;

	@GetMapping("/")
	List<Person> helloController() {
		List<Person> persons = personRepository.findAll();
		return persons;
	}

	@GetMapping("/test")
	String testController() {
		return "Test allah allah";
	}
}
