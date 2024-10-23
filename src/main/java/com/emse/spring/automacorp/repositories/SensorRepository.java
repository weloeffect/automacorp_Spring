package com.emse.spring.automacorp.repositories;

import com.emse.spring.automacorp.entities.SensorEntity;
import com.emse.spring.automacorp.entities.SensorType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorRepository extends JpaRepository<SensorEntity, Long> {
    List<SensorEntity> findBySensorType(SensorType sensorType);
}
