package com.emse.spring.automacorp.mappers;


import com.emse.spring.automacorp.dto.Sensor;
import com.emse.spring.automacorp.entities.SensorEntity;

public class SensorMapper {

    public static Sensor of(SensorEntity entity) {
        return new Sensor(
                entity.getId(),
                entity.getName(),
                entity.getValue(),
                entity.getSensorType()
        );
    }

    public static SensorEntity toEntity(Sensor dto) {
        SensorEntity entity = new SensorEntity();
        entity.setId(dto.id());
        entity.setName(dto.name());
        entity.setValue(dto.value());
        entity.setSensorType(dto.sensorType());
        return entity;
    }
}
