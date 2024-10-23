package com.emse.spring.automacorp.records.dao;

import java.util.List;

public record Building(Long id, String name, Double outsideTemperature, List<Room> rooms) {
}
