package com.emse.spring.automacorp.records.dto;

public record RoomCommand(String name, Double currentTemp, Double targetTemp, int floor, Long buildingId) {
}
