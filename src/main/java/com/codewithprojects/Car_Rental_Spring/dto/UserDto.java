package com.codewithprojects.Car_Rental_Spring.dto;

import com.codewithprojects.Car_Rental_Spring.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private UserRole userRole;
}

