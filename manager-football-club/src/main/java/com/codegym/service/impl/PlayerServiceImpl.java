package com.codegym.service.impl;

import com.codegym.dto.response.CommonResponseDto;
import com.codegym.dto.response.PlayerResponseDto;
import com.codegym.entity.Player;
import com.codegym.mapper.CommonResponseMapper;
import com.codegym.mapper.PlayerMapper;
import com.codegym.repository.PlayerRepository;
import com.codegym.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {


    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private CommonResponseMapper commonResponseMapper;

    @Override
    public CommonResponseDto getAllPlayer() {
        // data to entity
        List<Player> players = playerRepository.findAll();
        // entity to dto
        List<PlayerResponseDto> playerList = playerMapper.entitiesToDtos(players);
        // dto to common
        CommonResponseDto commonResponseDto = commonResponseMapper.ResDtoToCommonResponse(playerList);
        return commonResponseDto;
    }
}
