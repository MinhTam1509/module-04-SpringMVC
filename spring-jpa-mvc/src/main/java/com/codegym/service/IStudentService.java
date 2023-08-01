package com.codegym.service;

import com.codegym.model.Course;
import com.codegym.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    List<Student> findByName(String name);

}
