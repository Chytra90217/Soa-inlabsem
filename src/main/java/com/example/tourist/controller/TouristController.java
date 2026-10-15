package com.example.tourist.controller;

import com.example.tourist.entity.Tourist;
import com.example.tourist.repository.TouristRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {

    private final TouristRepository touristRepository;

    public TouristController(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    @PostMapping
    public ResponseEntity<?> createTourist(
            @RequestBody Tourist tourist) {

        Tourist savedTourist = touristRepository.save(tourist);

        return ResponseEntity.ok(savedTourist);
    }
}