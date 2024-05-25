package com.example.JavaAssessment.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CartStrut {
    private String name;
    private String description;
    private String price;
    private int quantity;

    public CartStrut(String name, String description, String price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

}
