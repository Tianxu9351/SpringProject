package com.example.springproject.service.impl;

import com.example.springproject.model.Student;
import com.example.springproject.model.Teacher;
import com.example.springproject.repository.TeacherRepository;
import com.example.springproject.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService{
    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }
    @Override
    public Teacher getTeacherById(Long id){
        return null;
    }
    public List<Teacher> getTeachers() {
        return null;
    };
//    public Teacher createOrUpdateTeacher(Teacher tea) {
//        return teacherRepository.save(tea);
//    }
    public Teacher updateTeacherById(Long id) {
        return null;
    }
//    public Teacher createTeacher(Teacher tea) {
//        return null;
//    }
    public String deleteTeacherById(Long id) {
        return null;
    }

}
