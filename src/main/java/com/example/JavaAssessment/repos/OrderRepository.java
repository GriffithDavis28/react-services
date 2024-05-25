package com.example.JavaAssessment.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaAssessment.models.Orders;


@Repository
public interface OrderRepository extends MongoRepository<Orders, String>{
    
}
