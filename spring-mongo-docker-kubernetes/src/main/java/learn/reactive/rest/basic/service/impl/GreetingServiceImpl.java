package learn.reactive.rest.basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.reactive.rest.basic.model.Employee;
import learn.reactive.rest.basic.repository.GreetingRepository;
import learn.reactive.rest.basic.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Autowired
	private GreetingRepository repository;

	@Override
	public List<Employee> getEmployees() {
		return repository.findAll();
	}
}
