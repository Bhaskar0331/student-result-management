package com.school.student.result.management.controller;

import com.school.student.result.management.model.Student;
import com.school.student.result.management.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value="/students", method=RequestMethod.GET)
    @ResponseBody
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @RequestMapping(value="/student", method=RequestMethod.POST)
    @ResponseBody
    public Student add(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @RequestMapping(value="/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Student find(@PathVariable("id") int studentId) {
        return studentRepository.findById(studentId);
    }

    @RequestMapping(value= "/student", method = RequestMethod.PUT)
    @ResponseBody
    public Student update(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @RequestMapping(value="/student/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(@PathVariable("id") int studentId) {
        studentRepository.deleteById(studentId);
        return studentId;
    }
}
