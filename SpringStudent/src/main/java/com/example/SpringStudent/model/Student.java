package com.example.SpringStudent.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_student;
    @Column(name = "firstname")
    private String name;
    @Column(name = "lastname")
    private String surname;
    @Column(name ="age")
    private int age;
    @Column(name ="email", unique = true)
    private String email;
}
