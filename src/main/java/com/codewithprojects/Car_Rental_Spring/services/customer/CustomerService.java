package com.codewithprojects.Car_Rental_Spring.services.customer;

import com.codewithprojects.Car_Rental_Spring.dto.BookACarDto;
import com.codewithprojects.Car_Rental_Spring.dto.CarDto;
import com.codewithprojects.Car_Rental_Spring.dto.CarDtoListDto;
import com.codewithprojects.Car_Rental_Spring.dto.SearchCarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(long carId);

    List<BookACarDto> getBookingsByUserId(Long userId);

    CarDtoListDto searchCar(SearchCarDto searchCarDto);


}
