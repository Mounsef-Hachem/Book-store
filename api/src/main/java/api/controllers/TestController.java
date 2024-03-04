package api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/")
	String helloController() {
		return "tooooooo";
	}
	
	@GetMapping("/test")
	String testController() {
		return "Test allah allah";
	}
}
