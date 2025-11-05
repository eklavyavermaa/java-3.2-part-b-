package com.example.hibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "course")
    private String course;

    public Student() {}
    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    // Getters and Setters
}
