package com.emse.spring.automacorp.controllers;

import com.emse.spring.automacorp.dto.Sensor;
import com.emse.spring.automacorp.entities.SensorType;
import com.emse.spring.automacorp.services.SensorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SensorController.class)
class SensorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SensorService sensorService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldFindAllSensors() throws Exception {
        Sensor sensor1 = new Sensor(1L, "Temperature Sensor", 30.0, SensorType.TEMPERATURE);
        Sensor sensor2 = new Sensor(2L, "Power Sensor", 50.0, SensorType.POWER);

        Mockito.when(sensorService.findAll()).thenReturn(List.of(sensor1, sensor2));

        mockMvc.perform(get("/api/sensors").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(status().isOk())
                .andExpect(jsonPath("[0].name").value("Temperature Sensor"))
                .andExpect(jsonPath("[1].name").value("Power Sensor"));
    }

    @Test
    void shouldFindSensorById() throws Exception {
        Sensor sensor = new Sensor(1L, "Temperature Sensor", 25.0, SensorType.TEMPERATURE);
        Mockito.when(sensorService.findById(1L)).thenReturn(java.util.Optional.of(sensor));

        mockMvc.perform(get("/api/sensors/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Temperature Sensor"));
    }

    @Test
    void shouldCreateSensor() throws Exception {
        Sensor sensor = new Sensor(null, "Temperature Sensor", 25.0, SensorType.TEMPERATURE);
        Sensor savedSensor = new Sensor(1L, "Temperature Sensor", 25.0, SensorType.TEMPERATURE);

        Mockito.when(sensorService.create(Mockito.any(Sensor.class))).thenReturn(savedSensor);

        mockMvc.perform(post("/api/sensors")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(sensor)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.name").value("Temperature Sensor"));
    }

    @Test
    void shouldDeleteSensor() throws Exception {
        mockMvc.perform(delete("/api/sensors/1"))
                .andExpect(status().isOk());

        Mockito.verify(sensorService, Mockito.times(1)).deleteById(1L);
    }
}