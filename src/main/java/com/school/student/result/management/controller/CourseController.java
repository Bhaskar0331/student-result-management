package com.school.student.result.management.controller;

import com.school.student.result.management.repos.CourseRepository;
import com.school.student.result.management.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping(value="/courses", method=RequestMethod.GET)
    @ResponseBody
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @RequestMapping(value="/course", method=RequestMethod.POST)
    @ResponseBody
    public Course add(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @RequestMapping(value="/course/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Course find(@PathVariable("id") int courseId) {
        return courseRepository.findById(courseId);
    }

    @RequestMapping(value= "/course", method = RequestMethod.PUT)
    @ResponseBody
    public Course update(@RequestBody Course course){
        return courseRepository.save(course);
    }

    @RequestMapping(value="/course/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(@PathVariable("id") int courseId) {
        courseRepository.deleteById(courseId);
        return courseId;
    }
}
