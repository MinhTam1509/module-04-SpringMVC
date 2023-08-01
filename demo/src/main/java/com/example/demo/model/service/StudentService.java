package com.example.demo.model.service;

import com.example.demo.model.dto.StudentDto;
import com.example.demo.model.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentDto> findAllStudent();
    void save(Student student);

}
