package learn.spring.authorization.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorization")
public class AuthorizationController {

	@GetMapping
	public String hello() {
		return ".. Authorization.. Guest..";
	}

	@GetMapping("/user")
	public String user() {
		return ".. Authorization.. User..";
	}

	@GetMapping("/admin")
	public String admin() {
		return ".. Authorization.. Admin..";
	}
}
