package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.service.cartService.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class CartController {
    public final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/carts")
    public ModelAndView listCart() {
        List<Cart> carts = this.cartService.findAll();
        ModelAndView modelAndView = new ModelAndView("cart/list-cart");
        modelAndView.addObject("carts", carts);
        return modelAndView;
    }
}
