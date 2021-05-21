package learn.spring.multiple.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication/multiple")
public class MultipleAuthenticationController {

	@GetMapping("{name}")
	public String hello(@PathVariable("name") String name) {
		return "Mr. " + name + ".. Type Authentication..";
	}
}
