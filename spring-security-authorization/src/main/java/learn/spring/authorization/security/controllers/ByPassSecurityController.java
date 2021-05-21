package learn.spring.authorization.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorization/bypass")
public class ByPassSecurityController {

	@GetMapping
	public String hello() {
		return ".. By Pass Authorization.. using permitAll..";
	}
}
