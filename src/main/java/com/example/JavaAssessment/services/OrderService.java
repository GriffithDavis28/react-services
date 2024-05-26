package com.example.JavaAssessment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaAssessment.models.Orders;
import com.example.JavaAssessment.repos.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepo;

    public Orders placeOrder(Orders order) {
        Orders savedOrder = orderRepo.save(order);
        savedOrder.calculateTotalPrice();
        return orderRepo.save(savedOrder);
    }

    public List<Orders> getOrders() {
        return orderRepo.findAll();
    }

    public Orders getOrderById(String id) {
        Optional<Orders> orders = orderRepo.findById(id);
        if (orders.isPresent()) {
            return orders.get();
        }
        return null;
    }
}
