package com.example.todomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todomanagement.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}