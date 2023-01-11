package com.example.school.Repository;

import com.example.school.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRep extends JpaRepository<Course,Integer> {

    @Modifying
    @Query(nativeQuery = true,value = "delete from user_course where course_fk=?1")
    public int deleteCourseForeign(int course_code);
}
