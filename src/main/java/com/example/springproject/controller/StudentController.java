package com.example.springproject.controller;

import com.example.springproject.exception.ResourceNotFoundException;
import com.example.springproject.model.Student;
import com.example.springproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@restController is a combination of @controller and @RequestBody
//@RequestBody uses HTTP message converters to convert the return value to HTTP response body
//@PathVariable binds the request URL template path variable to the method variable
@RestController
public class StudentController {

    private final StudentService studentService;
    // field injection(not recommend); construction injection; setter injection
    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PutMapping("student")
    public ResponseEntity<Student> putStudent(@RequestBody Student student) {
        Long id = student.getId();
        Student stu = studentService.getStudentById(id);
        return new ResponseEntity<>(studentService.createOrUpdateStudent(stu), HttpStatus.OK);
    }

    @PutMapping("student/{id}")
    public ResponseEntity<Student> putStudentById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(studentService.updateStudentById(id), HttpStatus.OK);
    }

    @PostMapping("student")
    public ResponseEntity<Student> createStudent(@RequestBody Student stu) {
        return new ResponseEntity<>(studentService.createStudent(stu), HttpStatus.CREATED);
    }

    @DeleteMapping("students/{id}")
    public String deleteStudentById(@PathVariable("id") Long id) {
        Student stu = studentService.getStudentById(id);
//        if (stu == null) {
//            throw new ResourceNotFoundException("Not Find student with id:" + id);
//        }
        return studentService.deleteStudentById(id);
    }
}
