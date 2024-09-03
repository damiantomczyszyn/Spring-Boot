package com.damiantomczyszyn.studentmanager;

import com.damiantomczyszyn.studentmanager.model.Student;
import com.damiantomczyszyn.studentmanager.model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/student/save")
    public Student createStudent(){
        Student student = new Student();
        student.setName("Chara");
        return repository.save(student);

    }
}
