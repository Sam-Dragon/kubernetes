package learn.reactive.rest.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.reactive.rest.basic.model.Employee;
import learn.reactive.rest.basic.service.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService service;

	@GetMapping("greet")
	public String greet() {
		return "Greeting to Reactive Spring World - Greet Version";
	}

	@GetMapping("employees")
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}
}
