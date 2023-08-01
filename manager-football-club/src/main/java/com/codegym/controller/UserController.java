package com.codegym.controller;

import com.codegym.dto.request.UserCreateRequestDto;
import com.codegym.dto.response.CommonResponseDto;
import com.codegym.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping ("/create")
    public ResponseEntity<?> createUser(@RequestBody UserCreateRequestDto requestDto) {
        CommonResponseDto commonResponseDto = userService.createUser(requestDto);
        return new ResponseEntity<>(commonResponseDto, HttpStatus.OK);
    }


}
