package com.springrest.courses.Controllers;
import com.springrest.courses.Entities.Course;
import com.springrest.courses.Services.CourseServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

    @Autowired
    private CourseServices service;

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.service.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable String id){
        Course course=this.service.getCourse(Long.parseLong(id));
        return course;
    }

    @PostMapping("/courses")
    public List<Course> addCourse(@RequestBody Course course){
        List<Course> courses= this.service.addCourse(course);
        return courses;
    }

    @PutMapping("/courses")
    public List<Course> updateCourse(@RequestBody Course course){
        List<Course> courses = this.service.updateCourse(course);
        return courses;
    }

    @DeleteMapping("/courses/{id}")
    public List<Course> deleteCourse(@PathVariable String id){
        List<Course> courses = this.service.deleteCourse(Long.parseLong(id));
        return courses;
    }
}
