package com.example.SpringStudent.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname")
    private String name;
    @Column(name = "lastname")
    private String surname;
    private int age;
    @Column(unique = true)
    private String email;

}
