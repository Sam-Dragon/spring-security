package learn.spring.roles.based.security.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/role/based/rolesallowed")
public class RoleBasedAuthorizationController {

	@RolesAllowed({"ROLE_ANONYMOUS"})
	@GetMapping
	public String hello() {
		return "Mr. Guest.. Roles Based Access..";
	}
	
	@RolesAllowed({"ROLE_USER", "ROLE_ADMIN"})
	@GetMapping("/user")
	public String user() {
		return "Mr. User.. Roles Based Access..";
	}
	
	@RolesAllowed({"ROLE_ADMIN"})
	@GetMapping("/admin")
	public String admin() {
		return "Mr. Admin.. Roles Based Access..";
	}
}
