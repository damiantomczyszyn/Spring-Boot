package com.damiantomczyszyn.todo_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter@Getter
public class Task {
    @Id
    private Long id;
    @NotBlank(message = "Task decription must be not null")
    private String description;

    private boolean done;

    public Task() {
    }


}
