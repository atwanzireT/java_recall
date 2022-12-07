package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudent(){
		return List.of(
			new Student (1L, "John", "john@gmail.com", LocalDate.of(2000, Month.JULY, 5), 22),
			new Student (2L, "Jerry", "jerry@gmail.com", LocalDate.of(1999, Month.JANUARY, 6), 23),
			new Student (3L, "Tom", "tom@gmail.com", LocalDate.of(2001, Month.FEBRUARY, 15), 21)
		);
	}
}
