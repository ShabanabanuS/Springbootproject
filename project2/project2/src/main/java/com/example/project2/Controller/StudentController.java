package com.example.project2.Controller;

import com.example.project2.Entity.Student;
import com.example.project2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<Student> postDetails(@RequestBody Student student) {
        Student savedStudent = studentService.saveDetails(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getDetails() {
        List<Student> students = studentService.getAllDetails();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}