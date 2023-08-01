package com.codegym.mapper;

import com.codegym.dto.response.CommonResponseDto;
import com.codegym.dto.response.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CommonResponseMapper {
    public CommonResponseDto ResDtoToCommonResponse(Object element) {
        CommonResponseDto commonResponseDto = CommonResponseDto
                .builder()
                .success(true)
                .message("success")
                .data(element)
                .build();
        return commonResponseDto;
    }
}
