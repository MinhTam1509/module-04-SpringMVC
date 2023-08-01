package com.example.demo.model.service;

import com.example.demo.model.dto.ClassRoomDto;
import com.example.demo.model.entity.ClassRoom;

import java.util.List;

public interface ClassRoomService {

    List<ClassRoomDto> findAllClassRoom();
}
