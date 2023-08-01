package com.codegym.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerResponseDto {

    private String namePlayer;

    private String footballClub;

    private int yearOfBirth;

    private String position;

    private int number;

    private Double marketValue;

}
