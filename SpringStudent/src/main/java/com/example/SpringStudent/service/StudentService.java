package com.example.SpringStudent.service;

import com.example.SpringStudent.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Student student);
    Student findByEmail(String email);


}
