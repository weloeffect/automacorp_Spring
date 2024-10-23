package com.emse.spring.automacorp.mappers;


import com.emse.spring.automacorp.dto.Room;
import com.emse.spring.automacorp.entities.RoomEntity;


import java.util.stream.Collectors;

public class RoomMapper {
    public static Room of(RoomEntity entity) {
        return new Room(
                entity.getId(),
                entity.getName(),
                entity.getWindows().stream().map(WindowMapper::of).collect(Collectors.toList())
        );
    }
}