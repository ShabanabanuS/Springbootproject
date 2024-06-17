package com.example.project2.Service;

import com.example.project2.Entity.Student;
import com.example.project2.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);

    }
    public List<Student> getAllDetails(){
        return studentRepo.findAll();
    }
}