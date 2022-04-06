package com.example.springproject.model;

import lombok.Data;

@Data
public class StudentDTO {
    private long id;
    private String name;

    public StudentDTO(Student stu) {
        this.id = stu.getId();
        this.name = stu.getName();
    }
}
