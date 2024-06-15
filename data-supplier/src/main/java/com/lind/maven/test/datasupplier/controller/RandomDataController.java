package com.lind.maven.test.datasupplier.controller;

import com.lind.maven.test.datasupplier.dto.RandomDataDTO;
import com.lind.maven.test.datasupplier.service.RandomDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomDataController {
    private final RandomDataService randomDataService;

    @Autowired
    public RandomDataController(RandomDataService randomDataService) {
        this.randomDataService = randomDataService;
    }

    @GetMapping(path = "/getData")
    public ResponseEntity<RandomDataDTO> getData() {
        return ResponseEntity.ok(randomDataService.getRandomData());
    }
}
