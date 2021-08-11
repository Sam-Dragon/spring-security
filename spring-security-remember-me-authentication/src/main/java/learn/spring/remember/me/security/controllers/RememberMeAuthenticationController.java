package learn.spring.remember.me.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication/basic")
public class RememberMeAuthenticationController {

	@GetMapping("{name}")
	public String hello(@PathVariable("name") String name) {
		return "Mr. " + name + ".. Basic Authentication..";
	}
}
