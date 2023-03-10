package de.neuefische.backend.bike;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BikeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @DirtiesContext
    @Test
    public void addBikeShouldReturnBikeWithId() throws Exception {
        mockMvc.perform(post("/api/bike-to-add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                   {
                                   "name": "Bike"
                                   }
                                """))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNotEmpty())
                .andExpect(jsonPath("$.name").value("Bike"));
    }
}