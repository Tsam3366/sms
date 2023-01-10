package com.example.school.smscontroller;

import com.example.school.smsmodel.User;
import com.example.school.smsservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;
    @PostMapping("/adduser")
    public User addUser(@RequestBody User user)
    {
        return userService.adduser(user);
    }
}
