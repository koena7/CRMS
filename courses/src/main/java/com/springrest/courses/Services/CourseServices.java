package com.springrest.courses.Services;

import java.util.List;

import com.springrest.courses.Entities.Course;

public interface CourseServices{

    List<Course> getCourses();

    Course getCourse(long id);

    List<Course> addCourse(Course course);

    List<Course> updateCourse(Course course);

    List<Course> deleteCourse(long id);

}