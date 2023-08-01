package com.example.demo.model.mapper;

import com.example.demo.model.dto.StudentDto;
import com.example.demo.model.entity.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentMapper {

    public StudentDto entityToDto(Student student) {
        StudentDto result =new StudentDto();
        BeanUtils.copyProperties(student, result);
        return result;
    }

    public List<StudentDto> entitiesToDtos(List<Student> studentList) {
        return studentList.stream()
                .map(this::entityToDto)
                .toList();
    }
}
