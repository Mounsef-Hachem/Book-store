package api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import common.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService service;
	
	@GetMapping("/")
	String helloController() {
		return service.sayHello();
	}
}
