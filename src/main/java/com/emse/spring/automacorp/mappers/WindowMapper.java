package com.emse.spring.automacorp.mappers;


import com.emse.spring.automacorp.entities.WindowEntity;
import com.emse.spring.automacorp.entities.WindowStatus;
import com.emse.spring.automacorp.records.dao.Window;

public class WindowMapper {
    public static Window of(WindowEntity window) {
        return new Window(
                window.getId(),
                window.getName(),
                SensorMapper.of(window.getWindowStatus()).value() == 1.0 ? WindowStatus.OPENED : WindowStatus.CLOSED,
                window.getRoom().getId()
        );
    }
}