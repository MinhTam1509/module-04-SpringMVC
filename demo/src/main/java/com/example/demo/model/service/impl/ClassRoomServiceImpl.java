package com.example.demo.model.service.impl;


import com.example.demo.model.dto.ClassRoomDto;
import com.example.demo.model.entity.ClassRoom;
import com.example.demo.model.mapper.ClassRoomMapper;
import com.example.demo.model.repository.ClassRoomRepository;
import com.example.demo.model.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    private ClassRoomRepository classRoomRepository;

    @Autowired
    private ClassRoomMapper classRoomMapper;

    @Override
    public List<ClassRoomDto> findAllClassRoom() {
        return classRoomMapper.entitiesToDtos(classRoomRepository.findAll());
    }
}
