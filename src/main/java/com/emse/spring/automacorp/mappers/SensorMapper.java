package com.emse.spring.automacorp.mappers;

import com.emse.spring.automacorp.entities.SensorEntity;
import com.emse.spring.automacorp.model.records.dto.dao.Sensor;

public class SensorMapper {
    public static Sensor of(SensorEntity sensor) {
        return new Sensor(
                sensor.getId(),
                sensor.getName(),
                sensor.getValue(),
                sensor.getSensorType()
        );
    }
}
