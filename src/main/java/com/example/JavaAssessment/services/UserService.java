package com.example.JavaAssessment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaAssessment.models.Users;
import com.example.JavaAssessment.repos.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;

    public List<Users> getUsers(){
        return userRepo.findAll();
    }

    public Users getUserById(String id){
        return userRepo.findById(id).get();
    }

    public Users createUser(Users user){
       return userRepo.save(user);
    }
}
