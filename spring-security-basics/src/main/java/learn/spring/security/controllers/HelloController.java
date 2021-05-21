package learn.spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class HelloController {

	@GetMapping("{name}")
	public String hello(@PathVariable("name") String name) {
		return "Mr. " + name + ".. Welcome to the Spring World..";
	}
}
