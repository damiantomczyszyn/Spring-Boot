package com.damiantomczyszyn.todo_app.controller;

import com.damiantomczyszyn.todo_app.model.Task;
import com.damiantomczyszyn.todo_app.model.TaskRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@RepositoryRestController
public class TaskController {
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    private final TaskRepository repository;
    TaskController( TaskRepository repository){
        this.repository = repository;
    }

    //ResponseEntity<List<Task>> readAllTasks() //List<Task> zamiast response entity
    @RequestMapping(method = RequestMethod.GET, path = "/tasks")
    ResponseEntity<?> readAllTasks(){
        //Resources
        logger.warn("Exposing all the tasks!");
        return ResponseEntity.ok(repository.findAll());
    }
    @GetMapping(value = "/tasks", params = {"!sort", "!page", "!size"})
    ResponseEntity<?> readAllTasks2(){
        //Resources
        logger.warn("Exposing all the tasks!");
        return ResponseEntity.ok(repository.findAll());
    }


}
