package com.codegym.repository.CartRepository;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CartRepositoryImpl implements CartRepository {
    private static final List<Cart> carts = new ArrayList<>();


    @Override
    public List<Cart> findAll() {
        return new ArrayList<>(carts);
    }

    @Override
    public Cart findById(int id) {
        Cart cart = carts.get(id);
        return cart;
    }
}
