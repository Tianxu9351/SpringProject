package com.example.springproject.model;

import lombok.Data;

@Data
public class TeacherDTO {
    private long id;
    private String name;

    public TeacherDTO(Teacher tea) {
        this.id = tea.getId();
        this.name = tea.getName();
    }
}
