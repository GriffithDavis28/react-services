package com.example.JavaAssessment.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderStruct {

    private String name;
    private String city;
    private int quantity;
    private List<CartStrut> items = new ArrayList<>();
    private double totalPrice;

    public OrderStruct(String name, String city, List<CartStrut> items) {
        this.name = name;
        this.city = city;
        this.items = items;
    }

    public void calculateTotalPrice() {
        totalQuantity(); 
        double totalPrice = 0.0;
        for (CartStrut item : items) {
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        this.totalPrice = totalPrice;
    }

    public void totalQuantity() {
        int quantity = 0;
        for (CartStrut cartStrut : items) {
            quantity += cartStrut.getQuantity();
        }
        this.quantity = quantity;
    }
}
