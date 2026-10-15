package com.example.tourist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tourist.entity.Tourist;

public interface TouristRepository
        extends JpaRepository<Tourist, Long> {
}