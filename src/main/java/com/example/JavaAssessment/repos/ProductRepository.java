package com.example.JavaAssessment.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaAssessment.models.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    
}
