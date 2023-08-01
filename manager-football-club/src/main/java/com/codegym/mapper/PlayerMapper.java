package com.codegym.mapper;

import com.codegym.dto.response.PlayerResponseDto;
import com.codegym.entity.Player;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerMapper {

    public List<PlayerResponseDto> entitiesToDtos(List<Player> playerList) {
        return playerList.stream()
                .map(this::entityToDto)
                .toList();
    }





    public PlayerResponseDto entityToDto(Player player) {
        PlayerResponseDto result = new PlayerResponseDto();
        BeanUtils.copyProperties(player, result);
        return result;
    }
}
