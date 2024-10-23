package com.emse.spring.automacorp.records.dao;


import com.emse.spring.automacorp.entities.SensorType;

public record Sensor(Long id, String name, Double value, SensorType sensorType) {
}
