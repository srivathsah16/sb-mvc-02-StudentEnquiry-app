package com.srivath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srivath.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
