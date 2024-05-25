package com.example.JavaAssessment.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("products")
public class Product {
    
    @Id
    private String id;

    @Nonnull
    private String name;
    private String description;
    private double price;

}
