package com.example.springproject.repository;

import com.example.springproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Spring Data JPA internally provides @Repository Annotation so we are no need to add @Repository annotation to StudentRepository interface
//By default Spring Data JPA made JapRepository methods transactional , So we are no need to add@Traansactional in Service class
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
