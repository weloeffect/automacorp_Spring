package com.emse.spring.automacorp.records.dao;


import com.emse.spring.automacorp.entities.HeaterStatus;

public record Heater(Long id, String name, Long roomId, HeaterStatus heaterStatus) {
}