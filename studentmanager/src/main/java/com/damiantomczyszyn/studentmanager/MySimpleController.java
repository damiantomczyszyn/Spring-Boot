package com.damiantomczyszyn.studentmanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MySimpleController {
    @RequestMapping(value={"/","/home"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String home(){
        return "Hello World!";
    }
    @RequestMapping("/test")
    public String secondHoome(){
        return "Hello World2!";
    }
    @RequestMapping("/sum")
    public int sum(@RequestParam("a") int a, @RequestParam("b") int b){
        return new Calculator().calculateSum(a,b);
    }

}
