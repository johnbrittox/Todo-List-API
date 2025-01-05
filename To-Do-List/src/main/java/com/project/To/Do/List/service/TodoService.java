package com.project.To.Do.List.service;

import java.util.List;

import com.project.To.Do.List.model.Todo;

public interface TodoService {
    public Todo saveTodo(Todo todo);
    public List<Todo> getAllTodos();
    public Todo getTodoById(Long id);
    public Todo updateTodo(Long id, Todo todo);
    public void deleteTodo(Long id);
}
