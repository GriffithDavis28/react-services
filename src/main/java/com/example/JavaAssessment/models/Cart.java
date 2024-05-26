package com.example.JavaAssessment.models;

import java.util.ArrayList;
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
    private List<CartStrut> items = new ArrayList<>();
    private double totalPrice;

    public Cart(String id, List<CartStrut> items) {
        this.id = id;
        this.items = items;
    }

    public void calculateTotalPrice() {
        double totalPrice = 0.0;
        for (CartStrut item : items) {
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        this.totalPrice = totalPrice;
    }
}
