package com.sample.student.controller;

import com.sample.student.model.Student;
import com.sample.student.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping
    public int create(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping()
    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
