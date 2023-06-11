package com.springrest.courses.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.courses.Entities.Course;

@Service
public class CourseServicesImpl implements CourseServices{

    List<Course> list;


    public CourseServicesImpl() {
        list = new ArrayList<>();
        list.add(new Course(1, "English", "Literature"));
        list.add(new Course(2, "Maths", "Mensuration"));
    }

    public List<Course> getCourses(){
        return list;
    }

    public Course getCourse(long id){
        for (Course course : list) {
            if(course.getId()==id){
                return course;
            }
        }
        return null;
    }

    public List<Course> addCourse(Course c){
        list.add(c);
        return list;
    }

    public List<Course> updateCourse(Course c){
        for (Course course : list) {
            if(c.getId()==course.getId()){
                course.setName(c.getName());
                course.setDesc(c.getDesc());
            }
        }
        return list;
    }

    public List<Course> deleteCourse(long id){
        for (Course c : list){
            if(c.getId()==id){
                list.remove(c);
            }
        }
        return list;
    }
}
