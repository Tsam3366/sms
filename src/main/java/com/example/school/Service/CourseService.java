package com.example.school.Service;

import com.example.school.Entity.Course;
import com.example.school.Repository.CourseRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRep rep;

    public Course insertCourse(Course c){
        return rep.save(c);
    }

    @Transactional
    public void deleteCourse(int course_code){
        if(rep.findById(course_code).isPresent()){
            int i=rep.deleteCourseForeign(course_code);
            System.out.println(i);
            Course temp=rep.findById(course_code).get();
            rep.delete(temp);
        }
        //rep.deleteById(course_code);
    }

    public Course updateCourse(int course_code,Course course){
        if(rep.findById(course_code).isPresent()){
            Course c=rep.findById(course_code).get();
            c.setCourse_code(course_code);
            c.setCourse_name(course.getCourse_name());
            c.setCourse_desc(course.getCourse_desc());
            c.setCourse_start(course.getCourse_start());
            c.setCourse_end(course.getCourse_end());
            return rep.save(c);
        }else{
            return new Course();
        }

    }
}
