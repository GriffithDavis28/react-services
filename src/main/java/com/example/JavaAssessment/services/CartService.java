package com.example.JavaAssessment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaAssessment.models.Cart;
import com.example.JavaAssessment.repos.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    public Cart addCart(Cart cart) {
        return cartRepo.save(cart);
    }
    
    public List<Cart> getCart()
    {
        return cartRepo.findAll();
    }

    public Cart getCartById(String id)
    {
        Optional<Cart> cart = cartRepo.findById(id);
        if(cart.isPresent())
        {
            return cart.get();
        }
            return null;
    }
}

