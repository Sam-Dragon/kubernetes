package learn.reactive.rest.basic.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import learn.reactive.rest.basic.model.Employee;

@Repository
public interface GreetingRepository extends MongoRepository<Employee, String> {

	List<Employee> findAll();
}
