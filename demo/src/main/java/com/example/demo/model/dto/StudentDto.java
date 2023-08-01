package com.example.demo.model.dto;


import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long id;

    private String name;

    private String dateOfBirth;

    private String email;

    private String address;

}
