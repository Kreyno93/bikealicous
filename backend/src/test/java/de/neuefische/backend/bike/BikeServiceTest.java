package de.neuefische.backend.bike;

import de.neuefische.backend.uuidService.UuidService;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BikeServiceTest {

    private final UuidService uuidService = mock(UuidService.class);
    private final BikeRepo bikeRepo = mock(BikeRepo.class);

private final BikeService bikeService = new BikeService(bikeRepo, uuidService);

    @Test
    void addBike() {
        Bike bike = new Bike(null,"Bike");

        when(uuidService.generateId()).thenReturn("1");
        when(bikeRepo.save(bike.withId("1"))).thenReturn(bike.withId("1"));

        ResponseEntity<Bike> result = bikeService.addBike(bike);
        System.out.println(result.getBody());

        assertEquals(result.getBody(), bike.withId("1"));
    }
}