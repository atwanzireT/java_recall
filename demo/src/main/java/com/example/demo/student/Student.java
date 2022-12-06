package com.example.demo.student;

import java.time.LocalDate;

public class Student {
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
