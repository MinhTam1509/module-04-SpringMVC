package com.codegym.cms.controller;

import com.codegym.cms.model.dto.UserDto;
import com.codegym.cms.model.entity.User;
import com.codegym.cms.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@CrossOrigin("*")
@RequestMapping
public class LoginController {


    @GetMapping("/login")
    public ModelAndView loginPage() {
        ModelAndView modelAndView = new ModelAndView("/loginPage");
        modelAndView.addObject("user", new UserDto());
        return modelAndView;
    }

    @GetMapping
    public ModelAndView logout(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("Home");
        session.removeAttribute("loggedInUser");
        return modelAndView;
    }
}
