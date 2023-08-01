package com.codegym.service.cartService;

import com.codegym.model.Cart;
import com.codegym.repository.CartRepository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartServiceImpl implements CartService {

    @Autowired
    public CartRepository cartRepository;

    @Override
    public List<Cart> findAll() {
        return this.cartRepository.findAll();
    }
    @Override
    public Cart findById(int id) {
        return this.cartRepository.findById(id);
    }

}
