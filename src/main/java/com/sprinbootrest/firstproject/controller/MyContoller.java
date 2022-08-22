package com.sprinbootrest.firstproject.controller;

import com.sprinbootrest.firstproject.model.Course;
import com.sprinbootrest.firstproject.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyContoller {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home() {
        return "Welcome to course application";
    }
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(value="/courses",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Course addcourse(@RequestBody Course course){

        return this.courseService.addCourse(course);
    }
}
