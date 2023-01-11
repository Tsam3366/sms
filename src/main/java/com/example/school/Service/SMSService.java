package com.example.school.Service;

import com.example.school.Entity.Course;
import com.example.school.Entity.User;
import com.example.school.Repository.CourseRep;
import com.example.school.Repository.SMSRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SMSService {

    @Autowired
    SMSRep rep;

    @Autowired
    CourseRep rep2;

    public User insertUser(User user){
        return rep.save(user);
    }

    public void deleteUser(int id){
        rep.deleteById(id);
    }
    public User getUserByID(int id){
        if(rep.findById(id).isPresent()){
            return rep.findById(id).get();
        }else {
            return new User();
        }

    }

    public void regCourse(int id,List<Course> list){
        User user;
        if(rep.findById(id).isPresent()){
           user=rep.findById(id).get();
        }else {
            user=new User();
        }
        for(Course c:list){
            //int course_code=c.getCourse_code();
            user.getCourseList().add(c);
            rep.save(user);
        }
    }


}
