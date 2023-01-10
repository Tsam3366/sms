package com.example.school.smscontroller;

import com.example.school.smsmodel.Course;
import com.example.school.smsservice.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
    @Autowired
    private CourseService courseService;

    @PostMapping("/addcourse")
    public Course addCourse(@RequestBody Course course)
    {
        return courseService.addCourse(course);
    }
}
