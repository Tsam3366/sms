package com.example.school.smsservice;

import com.example.school.smsmodel.User;
import com.example.school.smsrepo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;
    public User adduser(User user)
    {
        return userRepository.save(user);
    }
}
