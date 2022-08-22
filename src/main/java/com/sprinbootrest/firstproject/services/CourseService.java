package com.sprinbootrest.firstproject.services;

import com.sprinbootrest.firstproject.model.Course;

import java.util.List;

public interface CourseService {
    public  List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);
}
