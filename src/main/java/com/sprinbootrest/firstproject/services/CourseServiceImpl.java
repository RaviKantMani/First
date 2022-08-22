package com.sprinbootrest.firstproject.services;

import com.sprinbootrest.firstproject.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1,"Java Course","Basic Java"));
        list.add(new Course(2,"Spring Boot","Springg Boot description"));
    }

    @Override
    public List<Course> getCourses() {
            return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c =null;
        for (Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
