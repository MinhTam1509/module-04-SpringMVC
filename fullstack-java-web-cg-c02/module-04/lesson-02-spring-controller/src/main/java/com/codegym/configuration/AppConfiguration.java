package com.codegym.configuration;

import com.codegym.repository.CartRepository.CartRepository;
import com.codegym.repository.CartRepository.CartRepositoryImpl;
import com.codegym.repository.ProductRepository.ProductRepository;
import com.codegym.repository.ProductRepository.ProductRepositoryImpl;
import com.codegym.service.cartService.CartService;
import com.codegym.service.cartService.CartServiceImpl;
import com.codegym.service.productService.ProductService;
import com.codegym.service.productService.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }

    @Bean
    public CartService cartService() {
        return new CartServiceImpl();
    }

    @Bean
    public CartRepository cartRepository() {
        return new CartRepositoryImpl();
    }
}
