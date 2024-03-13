package com.springboot.jpaandhibernate.course.springdatajpa;

import com.springboot.jpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    // Custom methods
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
