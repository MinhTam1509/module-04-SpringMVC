package com.codegym.cms.model.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    
    private String username;
    
    private String email;
    
    private String password;
    
}
