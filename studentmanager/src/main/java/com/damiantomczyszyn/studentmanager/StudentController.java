package com.damiantomczyszyn.studentmanager;

import com.damiantomczyszyn.studentmanager.model.Student;
import com.damiantomczyszyn.studentmanager.model.StudentRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/student/save/sans")
    public Student createStudent1(){
        Student student = new Student();
        student.setName("Sans");
        return repository.save(student);
    }

    @PostMapping("/student/save2")
    public Student createPostStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @RequestMapping("/student/save2")
    public Student createStudent2(@RequestBody Student student){
        return repository.save(student);
    }
    @RequestMapping("/student/save3")
    public Student createStudent3(@RequestParam("email") String email){
        Student student = new Student();
        student.setEmail(email);
        return repository.save(student);
    }

    @RequestMapping("/student/find")
    public Student findStudent(){
        return repository.findByEmail("examplemail@outlook.com");
    }
    @RequestMapping("/student/find/1")
    public Student findStudent2(@RequestParam("email") String email){
        return repository.findByEmail(email);
    }


}
