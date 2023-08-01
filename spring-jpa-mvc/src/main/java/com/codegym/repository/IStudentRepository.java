package com.codegym.repository;

import com.codegym.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository {
    List<Student> findAll();
    List<Student> findByName(String name);
}
