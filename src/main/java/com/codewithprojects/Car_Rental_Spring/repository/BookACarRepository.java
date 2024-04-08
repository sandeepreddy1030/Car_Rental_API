package com.codewithprojects.Car_Rental_Spring.repository;

import com.codewithprojects.Car_Rental_Spring.dto.BookACarDto;
import com.codewithprojects.Car_Rental_Spring.entity.BookACar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookACarRepository extends JpaRepository<BookACar, Long> {


    List<BookACar> findAllByUserId(Long userId);
}
