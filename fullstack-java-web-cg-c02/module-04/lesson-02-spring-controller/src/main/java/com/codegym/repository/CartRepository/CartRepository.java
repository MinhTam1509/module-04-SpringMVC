package com.codegym.repository.CartRepository;

import com.codegym.model.Cart;
import com.codegym.model.Product;

import java.util.List;

public interface CartRepository {

    List<Cart>  findAll();
    Cart findById(int id);
}
