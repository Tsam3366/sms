package com.example.school.MyController;

import com.example.school.Entity.Course;
import com.example.school.Entity.User;
import com.example.school.Service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SMSController {

    @Autowired
    SMSService serv;

    @PostMapping("/insert")
    public User insertUser(@RequestBody User u){
        return serv.insertUser(u);
    }

    @DeleteMapping("/delete/{user_id}")
    public void deleteUser(@PathVariable int user_id){
        serv.deleteUser(user_id);
    }

    @GetMapping("/select/{user_id}")
    public User getUserByID(@PathVariable int user_id){
       return serv.getUserByID(user_id);
    }

    @PostMapping("/regCourse/{user_id}")
    public void regCourse(@PathVariable("user_id") int user_id,@RequestBody List<Course> list){
        serv.regCourse(user_id,list);
    }

}
