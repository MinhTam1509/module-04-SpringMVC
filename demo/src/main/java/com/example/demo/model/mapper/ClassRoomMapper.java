package com.example.demo.model.mapper;

import com.example.demo.model.dto.ClassRoomDto;
import com.example.demo.model.dto.StudentDto;
import com.example.demo.model.entity.ClassRoom;
import com.example.demo.model.entity.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClassRoomMapper {
    public ClassRoomDto entityToDto(ClassRoom classRoom) {
        ClassRoomDto result =new ClassRoomDto();
        BeanUtils.copyProperties(classRoom, result);
        return result;
    }

    public List<ClassRoomDto> entitiesToDtos(List<ClassRoom> classRoomList) {
        return classRoomList.stream()
                .map(this::entityToDto)
                .toList();
    }
}
