package com.example.JavaAssessment.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaAssessment.models.Users;


@Repository
public interface UserRepository extends MongoRepository<Users, String>{
    
}
