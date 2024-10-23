package com.emse.spring.automacorp.mappers;


import com.emse.spring.automacorp.dto.Window;
import com.emse.spring.automacorp.entities.RoomEntity;
import com.emse.spring.automacorp.entities.WindowEntity;

;

public class WindowMapper {

    public static Window of(WindowEntity entity) {
        return new Window(
                entity.getId(),
                entity.getName(),
                entity.getWindowStatus(),
                entity.getRoom() != null ? entity.getRoom().getId() : null
        );
    }

    public static WindowEntity toEntity(Window dto, RoomEntity roomEntity) {
        WindowEntity entity = new WindowEntity();
        entity.setId(dto.id());
        entity.setName(dto.name());
        entity.setWindowStatus(dto.windowStatus());
        entity.setRoom(roomEntity);
        return entity;
    }
}