package com.practice.api.Student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private int age;

    public Student() {

    }

    public Student(Long id, LocalDate dateOfBirth, String name, String email, int age) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(int age, LocalDate dateOfBirth, String email, String name) {
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.name = name;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }
}
