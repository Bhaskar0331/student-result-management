package com.school.student.result.management.repos;

import com.school.student.result.management.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> findAll();
    Course findById(int id);

}
