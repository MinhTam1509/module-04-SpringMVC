package com.example.demo.controller;

import com.example.demo.model.dto.StudentDto;
import com.example.demo.model.entity.Student;
import com.example.demo.model.service.ClassRoomService;
import com.example.demo.model.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class CreateController {

    private final StudentService studentService;

    private final ClassRoomService classRoomService;

    @GetMapping("/create")
    public ModelAndView createPage() {
        ModelAndView modelAndView = new ModelAndView("Create");
        modelAndView.addObject("student", new Student());
        modelAndView.addObject("classroomList", classRoomService.findAllClassRoom());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createStudent(@ModelAttribute("student") Student student) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        studentService.save(student);
        return modelAndView;
    }
}
