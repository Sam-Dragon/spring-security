package learn.spring.authentication.security.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

	@GetMapping("/context")
	public String securityContextHolder() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication auth = context.getAuthentication();

		System.out.println(auth.getCredentials() + " , " + auth.getName() + " , " + auth.getAuthorities() + " , "
				+ auth.getDetails() + " , USER PRINCIPAL " + auth.getPrincipal());

		return "Mr. " + auth.getName() + ".. Welcome to the Spring World..";
	}
}
