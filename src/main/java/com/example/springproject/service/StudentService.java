package com.example.springproject.service;

import com.example.springproject.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student getStudentById(Long id);
    List<Student> getStudents();
    Student createOrUpdateStudent(Student student);
    Student updateStudentById(Long id);
    Student createStudent(Student stu);
    String deleteStudentById(Long id);
}
