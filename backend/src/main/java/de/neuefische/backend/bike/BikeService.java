package de.neuefische.backend.bike;

import de.neuefische.backend.service.UuidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BikeService {

    private final BikeRepo bikeRepo;

    private final UuidService uuidService;

    public ResponseEntity<Bike> addBike(Bike bike) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bikeRepo.save(bike.withId(uuidService.generateId())));
    }
}
