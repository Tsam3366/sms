package com.example.school.MyController;

import com.example.school.Entity.Course;
import com.example.school.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    CourseService serv;

    @PostMapping("/addCourse")
    public Course insertCourse(@RequestBody Course course){
        return serv.insertCourse(course);
    }
    @DeleteMapping("/delCourse/{course_code}")
    public void deleteCourse(@PathVariable int course_code){
        serv.deleteCourse(course_code);
    }

    @PutMapping("/updCourse/{course_code}")
    public Course updateCourse(@PathVariable int course_code,@RequestBody Course c){
        return serv.updateCourse(course_code, c);
    }
}
