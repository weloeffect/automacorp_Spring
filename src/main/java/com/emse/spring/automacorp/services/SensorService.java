package com.emse.spring.automacorp.services;

import com.emse.spring.automacorp.dto.Sensor;
import com.emse.spring.automacorp.entities.SensorEntity;
import com.emse.spring.automacorp.mappers.SensorMapper;
import com.emse.spring.automacorp.repositories.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    // Fetch all sensors and convert them to DTOs
    public List<Sensor> findAll() {
        return sensorRepository.findAll().stream()
                .map(SensorMapper::of)
                .collect(Collectors.toList());
    }

    // Fetch a sensor by ID and convert to DTO
    public Optional<Sensor> findById(Long id) {
        return sensorRepository.findById(id)
                .map(SensorMapper::of);
    }

    // Create a new sensor from DTO
    public Sensor create(Sensor dto) {
        SensorEntity sensorEntity = SensorMapper.toEntity(dto);
        SensorEntity savedEntity = sensorRepository.save(sensorEntity);
        return SensorMapper.of(savedEntity);
    }

    // Update an existing sensor
    public Sensor update(Long id, Sensor dto) {
        Optional<SensorEntity> existingSensorOpt = sensorRepository.findById(id);

        if (existingSensorOpt.isPresent()) {
            SensorEntity sensorEntity = existingSensorOpt.get();
            sensorEntity.setName(dto.name());
            sensorEntity.setValue(dto.value());
            sensorEntity.setSensorType(dto.sensorType());

            SensorEntity updatedEntity = sensorRepository.save(sensorEntity);
            return SensorMapper.of(updatedEntity);
        } else {
            throw new IllegalArgumentException("Sensor not found");
        }
    }

    public void deleteById(Long id) {
        sensorRepository.deleteById(id);
    }
}
