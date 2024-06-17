package com.example.project2.Controller;

import com.example.project2.Entity.Student;
import com.example.project2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student)
    {
        return studentService.saveDetails(student);
    }
    @GetMapping("/getStudent")
    public List<Student> getDetails()
    {
        return studentService.getAllDetails();
    }
}
