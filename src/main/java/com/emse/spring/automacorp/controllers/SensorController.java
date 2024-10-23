package com.emse.spring.automacorp.controllers;

import com.emse.spring.automacorp.dto.Sensor;

import com.emse.spring.automacorp.services.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @GetMapping
    public List<Sensor> findAll() {
        return sensorService.findAll();
    }

    @GetMapping("/{id}")
    public Sensor findById(@PathVariable Long id) {
        return sensorService.findById(id).orElse(null);
    }

    @PostMapping
    public Sensor create(@RequestBody Sensor sensorDto) {
        return sensorService.create(sensorDto);
    }

    @PutMapping("/{id}")
    public Sensor update(@PathVariable Long id, @RequestBody Sensor sensorDto) {
        return sensorService.update(id, sensorDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sensorService.deleteById(id);
    }
}