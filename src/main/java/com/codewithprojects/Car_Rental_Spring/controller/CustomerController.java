package com.codewithprojects.Car_Rental_Spring.controller;

import com.codewithprojects.Car_Rental_Spring.dto.BookACarDto;
import com.codewithprojects.Car_Rental_Spring.dto.CarDto;
import com.codewithprojects.Car_Rental_Spring.dto.SearchCarDto;
import com.codewithprojects.Car_Rental_Spring.services.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/cars")
    public ResponseEntity<List<CarDto>> getAllCars(){
        List<CarDto> carDtoList = customerService.getAllCars();
        return ResponseEntity.ok(carDtoList);
    }

    @PostMapping("/car/book")
    public ResponseEntity<Void> bookACar(@RequestBody BookACarDto bookACarDto){
        boolean success = customerService.bookACar(bookACarDto);
        if(success) return ResponseEntity.status(HttpStatus.CREATED).build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping ("/car/{carId}")
    public ResponseEntity<Object> getCarById(@PathVariable Long carId){
        CarDto carDto = customerService.getCarById(carId);
        if(carDto==null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(carDto);
    }

    @GetMapping("/car/bookings/{userId}")
    public ResponseEntity<List<BookACarDto>> getBookingsByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(customerService.getBookingsByUserId(userId));
    }

    @PostMapping("/car/search")
    public ResponseEntity<?> searchCar(@RequestBody SearchCarDto searchCarDto){
        return ResponseEntity.ok(customerService.searchCar(searchCarDto));
    }


}
