package com.example.JavaAssessment.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CartStrut {
    private Product product;
    private int quantity;
    public CartStrut(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

}
