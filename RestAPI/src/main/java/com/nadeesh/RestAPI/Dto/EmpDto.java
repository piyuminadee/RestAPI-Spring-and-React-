package com.nadeesh.RestAPI.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
