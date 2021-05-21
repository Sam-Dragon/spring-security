package learn.spring.form.login.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication/form")
public class FormAuthenticationController {

	@GetMapping("{name}")
	public String hello(@PathVariable("name") String name) {
		return "Mr. " + name + ".. Form Authentication..";
	}
}
