package com.example.springproject.service.impl;

import com.example.springproject.model.Student;
import com.example.springproject.repository.StudentRepository;
import com.example.springproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional //because spring data jpa internally provide a transaction to all its methods
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
// Starting with Spring 4.3, if a class, which is configured as a Spring Bean, has only one constructor,
// the @Autowired can be omitted and Spring will use that constructor and inject all necessary dependencies
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getById(id);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();

    }
    public Student createOrUpdateStudent(Student student) {

        return studentRepository.save(student);
    }

    public Student updateStudentById(Long id) {
        Student stu =  studentRepository.findById(id).orElse(null);
        stu.setName(stu.getName());
        return studentRepository.save(stu);
    }

    public Student createStudent(Student stu) {
        return studentRepository.save(stu);
    }

    public String deleteStudentById(Long id) {
        studentRepository.deleteById(id);
        return "successfully removed";
    }

}
