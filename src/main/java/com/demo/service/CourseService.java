package com.demo.service;

import com.demo.entity.Courses;


import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();

    public Courses getCourse(Long courseId);

    public Courses addCourse(Courses course);

//    public Courses updateCourse(Long courseId, Courses updatedCourse);
public Courses updateCourse( Courses updatedCourse);


    public void deleteCourse(Long courseId);
}
