package com.example.springproject.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//@Table specifies the table in the database with which this entity is mapped
//@Id specifies the primary key of the entity
//@GenerateValue specifies the generation strategies for the values of primary keys
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Teacher> teachers;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


}
