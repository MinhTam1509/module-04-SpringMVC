package com.codegym.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerUpdateRequestDto {

    private String footballClub;

    private String position;

    private int number;

    private double marketValue;

    private double salary;

}
