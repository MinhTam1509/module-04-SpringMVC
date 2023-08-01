package com.codegym.controller;

import com.codegym.dto.response.CommonResponseDto;
import com.codegym.dto.response.PlayerResponseDto;
import com.codegym.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public ResponseEntity<?> showAllPlayers() {
        CommonResponseDto commonResponseDto = playerService.getAllPlayer();
        return new ResponseEntity<>(commonResponseDto, HttpStatus.OK);
    }
}
