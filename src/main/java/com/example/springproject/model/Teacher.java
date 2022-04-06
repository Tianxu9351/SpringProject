package com.example.springproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
