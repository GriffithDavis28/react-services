package com.example.JavaAssessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaAssessment.models.Orders;
import com.example.JavaAssessment.services.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Orders> getOrders(){
        return orderService.getOrders();
    }
    
    @PostMapping
    public Orders createOrder(@RequestBody Orders order){
        return orderService.placeOrder(order);
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable String id){
        return orderService.getOrderById(id);
    }
}
