package com.todo.todoappservices.repository;

import com.todo.todoappservices.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
