package com.example.StudentInfo.Controller;

import com.example.StudentInfo.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.StudentInfo.model.Student;

import java.util.List;

@RestController
@RequestMapping("/sriindu")
public class Studentcontroller {
    @Autowired
    private Studentservice service;
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return service.createstudent(student);
    }
    @PostMapping ("/addstudents")
    public List<Student> addstudents(@RequestBody List<Student> students){
        return service.createstudents(students);
    }
    @GetMapping("/students")
    public List<Student> getstudents(){
        return service.getstudents();
    }
    @GetMapping("/student/{id}")
    public Student getstudent(@PathVariable int id){
        return service.getstudent(id);
    }
    @DeleteMapping("/student/{id}")
    public String deletestudent(@PathVariable int id){
        return service.deletestudent(id);
    }
    @PutMapping("/student/{id}")
    public Student updatestudent(@PathVariable int id,@RequestBody Student student){
        return service.updatestudent(id,student);
}
}
