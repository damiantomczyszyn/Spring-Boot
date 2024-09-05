package com.damiantomczyszyn.todo_app.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {//tasks search

    @Override
    @RestResource(exported = false)
    void delete(Task entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Long> longs);

    @RestResource(path="done", rel = "done")//done
    List<Task> findByDone(@Param("state") boolean done);
}
