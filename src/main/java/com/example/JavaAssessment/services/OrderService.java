package com.example.JavaAssessment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaAssessment.models.Orders;
import com.example.JavaAssessment.repos.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepo;

    public List<Orders> getOrders(){
        return orderRepo.findAll();
    }
}
