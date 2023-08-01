package com.codegym.dto.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateRequestDto {

    private String username;

    private String password;

    private String email;

}
