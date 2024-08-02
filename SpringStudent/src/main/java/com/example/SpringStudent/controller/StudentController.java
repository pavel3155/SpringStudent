package com.example.SpringStudent.controller;

import com.example.SpringStudent.model.Student;
import com.example.SpringStudent.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent(){
        return service.findAllStudent();
    }
    @PostMapping("/save")
    public Student saveStudent (@RequestBody Student student){
        return service.saveStudent(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail (@PathVariable String email){
        return service.findByEmail(email);
    }
    @PutMapping("/update")
    public Student studentUpdate(@RequestBody Student student){
        return service.updateStudent(student);
    }




}
