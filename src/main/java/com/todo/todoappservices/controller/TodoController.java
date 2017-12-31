package com.todo.todoappservices.controller;


import com.todo.todoappservices.Model.Todo;
import com.todo.todoappservices.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api")
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @GetMapping("/todos")
    public List<Todo> getAll() {
        return  repository.findAll();
    }

    @PostMapping("/todo")
    public Todo addTodo(@RequestBody Todo todo) {
        return repository.save(todo);
    }

    @PutMapping("/todo/{id}")
    public Todo updateTodo(@RequestBody Todo todo,@PathVariable Long id) {
        return repository.save(todo);
    }

    @DeleteMapping("/todo/{id}")
    public void delte(@PathVariable Long id){
        repository.delete(id);
    }

}
