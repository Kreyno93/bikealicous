package de.neuefische.backend.bike;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bike {
    @Id
    @With
    private String id;
    private String name;
}
