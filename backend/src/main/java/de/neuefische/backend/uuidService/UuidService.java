package de.neuefische.backend.uuidService;

import org.springframework.stereotype.Service;

@Service
public class UuidService {

        public String generateId() {
            return java.util.UUID.randomUUID().toString();
        }
}
