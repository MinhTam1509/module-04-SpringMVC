package com.example.demo.controller;

import com.example.demo.model.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class HomeController {

    private final StudentService studentService;

    @GetMapping("/home")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("Home");
        modelAndView.addObject("student", studentService.findAllStudent());
        return modelAndView;
    }

}
