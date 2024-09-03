package com.damiantomczyszyn.todo_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter@Getter
public class Task {
    @Id
    private Long id;
    private String description;
    private boolean done;

    public Task() {
    }
}
