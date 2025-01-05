package com.project.To.Do.List.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.To.Do.List.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    // Custom queries can be added if necessary
}
