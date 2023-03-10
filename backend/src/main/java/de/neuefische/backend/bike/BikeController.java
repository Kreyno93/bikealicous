package de.neuefische.backend.bike;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BikeController {

    private final BikeService bikeService;

    @PostMapping("/bike-to-add")
    public ResponseEntity<Bike> addBike(@RequestBody Bike bike) {
        try {
            return bikeService.addBike(bike);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

}
