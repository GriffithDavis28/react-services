package com.example.JavaAssessment.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaAssessment.models.Cart;


@Repository
public interface CartRepository extends MongoRepository<Cart, String>{
    
}
