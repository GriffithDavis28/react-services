package com.example.JavaAssessment.models;

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

    public OrderStruct(String name, String city, int quantity) {
        this.name = name;
        this.city = city;
        this.quantity = quantity;
    }

}
