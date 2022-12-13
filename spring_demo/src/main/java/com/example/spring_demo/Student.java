package com.example.spring_demo;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity(name = "Student")
@Table(
    name = "Student",
    uniqueConstraints = {
        @UniqueConstraint(name ="student_email_unique", columnNames = "email")
    }
)
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = SEQUENCE,
        generator = "student_sequence" 
    )

    @Column(
        name = "id",
        updatable = false
    )
    private Long id;

    @Column(
        name = "firstname",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String firstname;

    @Column(
        name = "lastname",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String lastname;

    @Column(
        name = "email",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String email;

    @Column(
        name = "age",
        nullable = false
    )
    private Integer age;
    

    
    public Student(Long id, String firstname, String lastname, String email, Integer age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    // getters and setters 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
