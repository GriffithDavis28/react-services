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
@Document("orders")
public class Orders {
    
    @Id
    private String id;
    private List<OrderStruct> order;
    private int totalPrice;

    public Orders(String id, List<OrderStruct> order) {
        this.id=id;
        this.order = order;
    }

    public void calculateTotalPrice(){
        int totalPrice = 0;
        for(OrderStruct orderStruct : order){
            orderStruct.calculateTotalPrice();
            orderStruct.totalQuantity();
            totalPrice +=orderStruct.getTotalPrice();
            // totalPrice += orderStruct.getTotalPrice() * orderStruct.getQuantity();
            }
            this.totalPrice = totalPrice;
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (OrderStruct orderStruct : order) {
            orderStruct.calculateTotalPrice();
            totalQuantity += orderStruct.getQuantity();
        }
        return totalQuantity;
    }
}
