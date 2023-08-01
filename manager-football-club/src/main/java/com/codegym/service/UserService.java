package com.codegym.service;


import com.codegym.dto.request.UserCreateRequestDto;
import com.codegym.dto.response.CommonResponseDto;
import com.codegym.dto.response.UserResponseDto;
import com.codegym.entity.User;


import java.util.List;
import java.util.Optional;

public interface UserService {

//    CommonResponseDto createUser(UserCreateRequestDto requestDto);

    UserDto getUserById(Integer userId);
    void save(UserDto userDto);
    void remove(Integer id);
}
