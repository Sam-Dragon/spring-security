package learn.spring.jdbc.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication/jdbc")
public class JdbcAuthenticationController {
	
	@GetMapping
	public String hello() {
		return ".. Jdbc Authentication .. Guest..";
	}

	@GetMapping("/user")
	public String user() {
		return ".. Jdbc Authentication .. User..";
	}

	@GetMapping("/admin")
	public String admin() {
		return ".. Jdbc Authentication .. Admin..";
	}
}
