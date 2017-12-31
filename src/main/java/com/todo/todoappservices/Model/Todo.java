package com.todo.todoappservices.Model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public @Data class Todo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 250 , unique = true)
    private String title;

    private boolean complete;

}
