package de.neuefische.backend.bike;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BikeController {

    private final BikeService bikeService;

    @PostMapping("/bike-to-add")
    public ResponseEntity<Bike> addBike(@RequestBody Bike bike) {
            return bikeService.addBike(bike);

    }

}
