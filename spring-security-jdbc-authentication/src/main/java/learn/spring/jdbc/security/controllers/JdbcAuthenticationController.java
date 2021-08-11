package learn.spring.jdbc.security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.spring.jdbc.security.dao.Department;
import learn.spring.jdbc.security.repository.JdbcAuthenticationRepository;

@RestController
@RequestMapping("/authentication/jdbc")
public class JdbcAuthenticationController {

	@Autowired
	private JdbcAuthenticationRepository repository;

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

	@GetMapping("/department")
	public List<Department> departments() {
		return repository.findAll();
	}

}
