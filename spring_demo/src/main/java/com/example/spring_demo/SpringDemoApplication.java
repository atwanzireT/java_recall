package com.example.spring_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandlinerunner(StudentRepository studentRepository) {
		return args -> {
			Student maria = new Student(
					"Maria",
					"Jones",
					"maria.jones@gmail.com",
					21);
			// Student ahmed = new Student(
			// "Ahmed",
			// "Ali",
			// "ahmed.ali@amigoscode.edu",
			// 18
			// );
			studentRepository.save(maria);
		};
	}
}
