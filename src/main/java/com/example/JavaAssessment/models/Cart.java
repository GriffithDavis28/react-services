package com.example.JavaAssessment.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document("cart")
public class Cart {
    
    @Id
    private String id;

    private List<CartStrut> items;

    public Cart(String id, List<CartStrut> items) {
        this.id = id;
        this.items = items;
    }

    
}
