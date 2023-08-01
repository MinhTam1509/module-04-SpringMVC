package com.codegym.service.cartService;

import com.codegym.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findAll();

    Cart findById(int id);

}
