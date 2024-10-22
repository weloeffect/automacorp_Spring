package com.example.application.dto;



public record SensorDto(Long id, String name, Double value, SensorType sensorType) {
}