package learn.spring.roles.based.security.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/role/based/secured")
public class RoleBasedAuthorizationController {

	@Secured({"ROLE_ANONYMOUS"})
	@GetMapping
	public String hello() {
		return "Mr. Guest.. Roles Based Access..";
	}
	
	@Secured({"ROLE_USER", "ROLE_ADMIN"})
	@GetMapping("/user")
	public String user() {
		return "Mr. User.. Roles Based Access..";
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/admin")
	public String admin() {
		return "Mr. Admin.. Roles Based Access..";
	}
}
