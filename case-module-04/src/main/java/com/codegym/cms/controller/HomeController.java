package com.codegym.cms.controller;

import com.codegym.cms.model.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping()
@RequiredArgsConstructor
public class HomeController {

    private final ProductService productService;

    @GetMapping("/home")
    public ModelAndView homePage() {
//        String loggedInUser = (String) session.getAttribute("loggedInUser");
        ModelAndView modelAndView = new ModelAndView("Home");
//        modelAndView.addObject("loggedInUser", loggedInUser);
        modelAndView.addObject("product", productService.findAllProduct());
        return modelAndView;
    }

//    @GetMapping
//    public ModelAndView home(HttpSession session) {
//        String loggedInUser = (String) session.getAttribute("loggedInUser");
//        ModelAndView modelAndView = new ModelAndView("Home");
//        modelAndView.addObject("loggedInUser", loggedInUser);
//        return modelAndView;
//    }
}
