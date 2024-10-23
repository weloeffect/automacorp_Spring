package com.emse.spring.automacorp.dto;

import com.emse.spring.automacorp.entities.SensorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDao extends JpaRepository<SensorEntity, Long> {
}
