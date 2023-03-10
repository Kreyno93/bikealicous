package de.neuefische.backend.bike;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepo extends MongoRepository<Bike, String> {
}
