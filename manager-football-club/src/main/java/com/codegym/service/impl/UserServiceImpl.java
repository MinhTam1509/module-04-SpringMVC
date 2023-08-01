package com.codegym.service.impl;

import com.codegym.dto.request.UserCreateRequestDto;
import com.codegym.dto.response.CommonResponseDto;
import com.codegym.dto.response.UserResponseDto;
import com.codegym.entity.User;
import com.codegym.mapper.CommonResponseMapper;
import com.codegym.mapper.UserMapper;
import com.codegym.repository.UserRepository;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CommonResponseMapper commonResponseMapper;

    @Override
    public CommonResponseDto createUser(UserCreateRequestDto requestDto) {
        User user = userMapper.reqDtoToEntity(requestDto);
        userRepository.save(user);
        UserResponseDto userResponseDto = userMapper.entityToDto(user);
        return commonResponseMapper.ResDtoToCommonResponse(userResponseDto);
    }
}
