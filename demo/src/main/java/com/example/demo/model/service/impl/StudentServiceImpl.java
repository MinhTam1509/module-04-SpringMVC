package com.example.demo.model.service.impl;

import com.example.demo.model.dto.StudentDto;
import com.example.demo.model.entity.Student;
import com.example.demo.model.mapper.StudentMapper;
import com.example.demo.model.repository.StudentRepository;
import com.example.demo.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentDto> findAllStudent() {
        return studentMapper.entitiesToDtos(studentRepository.findAll());
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
}
