package com.example.springproject.service;

import com.example.springproject.model.Student;
import com.example.springproject.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    Teacher getTeacherById(Long id);
    List<Teacher> getTeachers();
//    Teacher createOrUpdateTeacher(Student student);
    Teacher updateTeacherById(Long id);
//    Teacher createTeacher(Student stu);
    String deleteTeacherById(Long id);
}
