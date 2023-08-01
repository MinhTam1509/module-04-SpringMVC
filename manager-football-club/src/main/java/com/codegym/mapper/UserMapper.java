package com.codegym.mapper;

import com.codegym.dto.request.UserCreateRequestDto;
import com.codegym.dto.response.CommonResponseDto;
import com.codegym.dto.response.UserResponseDto;
import com.codegym.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
//    public User reqDtoToEntity2(UserCreateRequestDto element) {
//        User result = User
//                .builder()
//                .username(element.getUsername())
//                .email(element.getEmail())
//                .password(element.getPassword())
//                .build();
//        return result;
//    }

    public User reqDtoToEntity(UserCreateRequestDto element) {
        User result = new User();
        BeanUtils.copyProperties(element, result);
        return result;
    }

    public UserResponseDto entityToDto(User element) {
        UserResponseDto result = new UserResponseDto();
        BeanUtils.copyProperties(element, result);
        return result;
    }

//    public UserResponseDto entityToDto2(User user) {
//        UserResponseDto result = UserResponseDto
//                .builder()
//                .username(user.getUsername())
//                .email(user.getEmail())
//                .build();
//        return result;
//    }

//    public CommonResponseDto ResDtoToCommonResponse(UserResponseDto userResponseDto) {
//        CommonResponseDto commonResponseDto = CommonResponseDto
//                .builder()
//                .success(true)
//                .message("success")
//                .data(userResponseDto)
//                .build();
//        return commonResponseDto;
//    }
}
