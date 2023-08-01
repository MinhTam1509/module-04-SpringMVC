package com.codegym.cms.controller;

import com.codegym.cms.model.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductDetailController {

    private final ProductService productService;

    @GetMapping("{id}")
    public ModelAndView showInfoProduct(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("productDetail");
        modelAndView.addObject("productDetail", productService.findById(id));
        modelAndView.addObject("product", productService.findAllProduct());
        return modelAndView;
    }
}
