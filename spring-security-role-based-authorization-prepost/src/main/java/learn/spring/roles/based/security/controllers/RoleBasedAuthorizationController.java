package learn.spring.roles.based.security.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/role/based/prepost")
public class RoleBasedAuthorizationController {

	@PreAuthorize("permitAll")
	@GetMapping
	public String hello() {
		return "Mr. Guest.. Roles Based Access..";
	}

	@PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
	@GetMapping("/user")
	public String user() {
		return "Mr. User.. Roles Based Access..";
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/admin")
	public String admin() {
		return "Mr. Admin.. Roles Based Access..";
	}

	@PreAuthorize("denyAll")
	@GetMapping("/deny")
	public String deny() {
		return "Mr. Guest.. Roles Based Access Deny..";
	}

	@PreAuthorize("isRememberMe()")
	@GetMapping("/remember")
	public String rememberMe() {
		return "Mr. Guest.. Roles Based Access Remember Me..";
	}

	@PreAuthorize("isAuthenticated()")
	@GetMapping("/authenticated")
	public String authenticated() {
		return "Mr. Guest.. Roles Based Access Remember Me..";
	}

	/*
	 * @PreAuthorize("hasPermission()")
	 * 
	 * @GetMapping("/permission") public String rememberMe() { return
	 * "Mr. Guest.. Roles Based Access Remember Me.."; }
	 */
}
