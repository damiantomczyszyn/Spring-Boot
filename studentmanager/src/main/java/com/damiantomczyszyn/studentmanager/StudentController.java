package com.damiantomczyszyn.studentmanager;

import com.damiantomczyszyn.studentmanager.model.Student;
import com.damiantomczyszyn.studentmanager.model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


}
