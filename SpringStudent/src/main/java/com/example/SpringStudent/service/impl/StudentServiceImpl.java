package com.example.SpringStudent.service.impl;

import com.example.SpringStudent.model.Student;
import com.example.SpringStudent.repo.StudentRepository;
import com.example.SpringStudent.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentServiceImpl  implements StudentService {
    private StudentRepository repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        repository.delete(student);
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }
}
