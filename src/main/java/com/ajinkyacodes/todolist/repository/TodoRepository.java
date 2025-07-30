package com.ajinkyacodes.todolist.repository;

import com.ajinkyacodes.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
