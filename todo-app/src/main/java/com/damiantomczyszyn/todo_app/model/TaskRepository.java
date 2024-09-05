package com.damiantomczyszyn.todo_app.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Override
    @RestResource(exported = false)
    void delete(Task entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Long> longs);
}
