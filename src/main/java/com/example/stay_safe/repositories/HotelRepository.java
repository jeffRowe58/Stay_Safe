package com.example.stay_safe.repositories;

import com.example.stay_safe.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
