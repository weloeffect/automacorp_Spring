package com.emse.spring.automacorp.mappers;


import com.emse.spring.automacorp.entities.HeaterEntity;
import com.emse.spring.automacorp.entities.HeaterStatus;
import com.emse.spring.automacorp.records.dao.Heater;

public class HeaterMapper {
    public static Heater of(HeaterEntity heater) {
        return new Heater(
                heater.getId(),
                heater.getName(),
                heater.getRoom().getId(),
                SensorMapper.of(heater.getStatus()).value() == 1.0 ? HeaterStatus.ON : HeaterStatus.OFF
        );
    }
}