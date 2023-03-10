package de.neuefische.backend.service;

import org.springframework.stereotype.Service;

@Service
public class UuidService {

        public String generateId() {
            return java.util.UUID.randomUUID().toString();
        }
}
