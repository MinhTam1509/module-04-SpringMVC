package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping({"/", "/students"})
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping
    public ModelAndView showListStudent() {
        ModelAndView modelAndView = new ModelAndView("student/list_students");
        List<Student> students = studentService.findAll();
        modelAndView.addObject("students", students);
        return modelAndView;
    }

//    @GetMapping("{id}")
//    public ModelAndView showInfomation(@PathVariable  id) {
//        ModelAndView modelAndView = new ModelAndView("customer/info");
//        Customer customer = customerService.findById(id);
//        modelAndView.addObject("customers", customer);
//        return modelAndView;
//    }
}
