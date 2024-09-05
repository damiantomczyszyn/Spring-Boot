package com.damiantomczyszyn.todo_app.controller;

import com.damiantomczyszyn.todo_app.model.Task;
import com.damiantomczyszyn.todo_app.model.TaskRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class TaskController {
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    private final TaskRepository repository;

    TaskController( final TaskRepository repository){
        this.repository = repository;
    }

    //ResponseEntity<List<Task>> readAllTasks() //List<Task> zamiast response entity
    @RequestMapping(method = RequestMethod.GET, path = "/tasks")
    ResponseEntity<List<Task>> readAllTasks(Pageable page){
        logger.info("Custom pageable!");
        return ResponseEntity.ok(repository.findAll(page).getContent());
    }

    @GetMapping(value = "/tasks", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Task>> readAllTasks(){
        //Resources
        logger.warn("Exposing all the tasks!");
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/tasks")
    ResponseEntity<List<Task>> createTasks(@RequestBody List<Task> tasks) {
       return ResponseEntity.ok(repository.saveAll(tasks));
    }

    @PutMapping("/tasks/{id}")
    ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody Task toUpdate){
        if(!repository.existsById(id)){
           return ResponseEntity.notFound().build();
        }
        repository.save(toUpdate);
        return ResponseEntity.noContent().build();

    }


}
