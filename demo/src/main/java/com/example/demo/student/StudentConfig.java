package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    /**
     * @param repository
     * @return
     */
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student john = new Student ( null, "John", "john@gmail.com", 22);
			Student jerry = new Student (null, "Jerry", "jerry@gmail.com", 23);
			Student tom = new Student (null, "Tom", "tom@gmail.com", 21);

            repository.saveAll(
                List.of(john, jerry, tom)
            );
        };
    };
}
