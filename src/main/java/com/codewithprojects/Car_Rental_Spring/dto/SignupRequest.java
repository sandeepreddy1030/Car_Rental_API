package com.codewithprojects.Car_Rental_Spring.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String name;
    private String password;
}
