package com.emse.spring.automacorp.records.dto;


import com.emse.spring.automacorp.entities.SensorType;

public record SensorCommand(String name, Double value, SensorType sensorType) {
}