package com.demo.service;

import com.demo.dao.CourseDao;
import com.demo.entity.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
@Autowired
    private CourseDao courseDao;
    List<Courses> list;

    public CourseServiceImpl() {
//        list=new ArrayList<>();
//        list.add(new Courses(145,"Java Core Course","this course contains basics of java"));
//        list.add(new Courses(146,"Spring boot Course","creating rest api using springboot"));

    }

    @Override
    public List<Courses> getCourses() {

//        return list;
        return courseDao.findAll();
    }

    @Override
    public Courses getCourse(Long courseId) {
//        Courses c=null;
//        for(Courses course:list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
//        return c;
        Optional<Courses> optionalCourse=courseDao.findById(courseId);
         return optionalCourse.orElse(null);
    }

    @Override
    public Courses addCourse(Courses course) {
//        list.add(course);
        LocalDate currentDate=LocalDate.now();
        course.setInvoiceDate(currentDate);
        courseDao.save(course);
        return course;
    }
    @Override
//    public Courses updateCourse(Long courseId, Courses updatedCourse)
    public Courses updateCourse(Courses updatedCourse)   {
//        for (Courses course : list) {
//            if (course.getId() == courseId) {
//                course.setTitle(updatedCourse.getTitle());
//                course.setDescription(updatedCourse.getDescription());
//                // You can update other properties as needed
//
//                return course; // Return the updated course
//            }
//        }
        courseDao.save(updatedCourse);
        return updatedCourse; // Return null if the course with the specified ID is not found
    }

    @Override
    public void deleteCourse(Long courseId) {
//        list.forEach(course -> {
//            if (course.getId() == courseId) {
//                list.remove(course); // Remove the course from the list
//                // Exit the forEach loop after removal
//            }
//        });
        courseDao.deleteById(courseId);
    }


}

