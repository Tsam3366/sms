package com.example.school.Repository;

import com.example.school.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRep extends JpaRepository<Course,Integer> {
}
