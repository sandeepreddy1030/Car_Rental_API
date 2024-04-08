package com.codewithprojects.Car_Rental_Spring.services.auth;

import com.codewithprojects.Car_Rental_Spring.dto.UserDto;
import com.codewithprojects.Car_Rental_Spring.dto.SignupRequest;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
