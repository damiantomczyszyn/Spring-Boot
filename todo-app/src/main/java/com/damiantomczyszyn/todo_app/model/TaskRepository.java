package com.damiantomczyszyn.todo_app.model;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;


public interface TaskRepository {
    List<Task>findAll();
    Optional<Task> findById(Long id);
    Task save(Task entity);
    Page<Task> findAll(Pageable page);

    List<Task> findByDone(@Param("state") boolean done);

    <S extends Task> List<S> saveAll(Iterable<S> entities);

    boolean existsById(Long id);
}
