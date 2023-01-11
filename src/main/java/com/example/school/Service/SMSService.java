package com.example.school.Service;

import com.example.school.Entity.User;
import com.example.school.Repository.SMSRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SMSService {

    @Autowired
    SMSRep rep;

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

    public void regCourse(int user_id,int course_code){

    }
}
