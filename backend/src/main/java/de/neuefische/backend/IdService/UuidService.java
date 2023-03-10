package de.neuefische.backend.IdService;

import org.springframework.stereotype.Service;

@Service
public class UuidService {

        public String generateId() {
            return java.util.UUID.randomUUID().toString();
        }
}
