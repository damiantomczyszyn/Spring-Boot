package com.damiantomczyszyn.todo_app.controller;


import com.damiantomczyszyn.todo_app.TaskConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {


    private DataSourceProperties dataSource;
    private TaskConfigurationProperties myProp;

    public InfoController(TaskConfigurationProperties  myProp, DataSourceProperties dataSource) {
        this.myProp = myProp;
        this.dataSource = dataSource;
    }

    @GetMapping("/info/url")
    String url(){
    return dataSource.getUrl();
    }
    @GetMapping("/info/prop")
    boolean myProp(){
    return myProp.isAllowMultipleTasksFromTemplate();
    }
}
