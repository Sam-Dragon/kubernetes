package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SampleDockerKubernetesApplication {

	@GetMapping
	public String getBooks() {
		return "Sample Project helping in understanding docker & kubernetes";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleDockerKubernetesApplication.class, args);
	}

}
