package learn.spring.url.based.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
public class UrlBasedAuthorizationController {

	@GetMapping("/hello")
	public String hello() {
		return "Mr. Guest.. Welcome to the Spring World..";
	}

	@GetMapping("/welcome/user")
	public String user() {
		return "Mr. User.. Welcome to the Spring World..";
	}

	@GetMapping("welcome/admin")
	public String admin() {
		return "Mr. Admin.. Welcome to the Spring World..";
	}
}
