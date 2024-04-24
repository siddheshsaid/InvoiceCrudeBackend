package com.demo.dao;

import com.demo.entity.Courses;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseDao extends JpaRepository<Courses, Long> {
    Optional<Courses> findById(Long courseId);

}
