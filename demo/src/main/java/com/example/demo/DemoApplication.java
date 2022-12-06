package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public List<Student> hello(){
		return List.of(
			new Student (1L, "John", "john@gmail.com", LocalDate.of(2000, Month.JULY, 5), 22),
			new Student (2L, "Jerry", "jerry@gmail.com", LocalDate.of(1999, Month.JANUARY, 6), 23),
			new Student (3L, "Tom", "tom@gmail.com", LocalDate.of(2001, Month.FEBRUARY, 15), 21)
		);
	}

}
