package com.emse.spring.automacorp.mappers;

import com.emse.spring.automacorp.entities.RoomEntity;
import com.emse.spring.automacorp.model.records.dto.dao.Room;

public class RoomMapper {
    public static Room of(RoomEntity room){
        return new Room(
                room.getId(),
                room.getName(),
                room.getCurrentTemperature().getValue(),
                room.getTargetTemperature()
        );
    }
}