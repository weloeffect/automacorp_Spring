package com.emse.spring.automacorp.mappers;

import com.emse.spring.automacorp.dto.Sensor;
import com.emse.spring.automacorp.entities.SensorEntity;
import com.emse.spring.automacorp.entities.SensorType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SensorMapperTest {

    @Test
    void shouldMapSensorEntityToDto() {
        SensorEntity sensorEntity = new SensorEntity();
        sensorEntity.setId(1L);
        sensorEntity.setName("Temperature Sensor");
        sensorEntity.setSensorType(SensorType.TEMPERATURE);
        sensorEntity.setValue(25.0);

        Sensor sensor = SensorMapper.of(sensorEntity);

        assertEquals(1L, sensor.id());
        assertEquals("Temperature Sensor", sensor.name());
        assertEquals(SensorType.TEMPERATURE, sensor.sensorType());
        assertEquals(25.0, sensor.value());
    }
}
