package com.example.school.smsservice;

import com.example.school.smsmodel.Course;
import com.example.school.smsrepo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService
{
    @Autowired
    private CourseRepository courseRepository;
    public Course addCourse(Course course)
    {
        return courseRepository.save(course);
    }
}
