package com.codegym.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonResponseDto {

    private Boolean success;

    private String message;

    private Object data;

}
