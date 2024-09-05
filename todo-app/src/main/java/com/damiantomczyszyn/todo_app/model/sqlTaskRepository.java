package com.damiantomczyszyn.todo_app.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface sqlTaskRepository extends TaskRepository, JpaRepository<Task, Long> {//tasks search

}
