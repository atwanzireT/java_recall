package com.example.demo.student;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence"
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    
    private Long id;
    private String name;
    private String email;
    private LocalDate dOB;
    private int age;
    
    public Student(Long id, String name, String email, LocalDate dOB, int i) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dOB = dOB;
        this.age = i;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public LocalDate getdOB() {
        return dOB;
    }
    public int getAge() {
        return age;
    }
}
