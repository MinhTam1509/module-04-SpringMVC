package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = {"/", "/customers"})
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ModelAndView showListCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customers", customerList);
        return modelAndView;
    }

    @GetMapping("{id}")
    public ModelAndView showInfomation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("customer/info");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customers", customer);
        return modelAndView;
    }

}
