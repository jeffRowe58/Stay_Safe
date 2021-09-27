package com.example.stay_safe.repositories;

import com.example.stay_safe.models.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingsRepository extends JpaRepository<Ratings, Long> {
}
