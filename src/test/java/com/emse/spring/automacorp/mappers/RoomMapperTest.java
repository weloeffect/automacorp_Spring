package com.emse.spring.automacorp.mappers;

import com.emse.spring.automacorp.dto.Room;
import com.emse.spring.automacorp.entities.RoomEntity;
import com.emse.spring.automacorp.entities.WindowEntity;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoomMapperTest {

    @Test
    void shouldMapRoomEntityToDto() {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(1L);
        roomEntity.setName("Room 1");

        WindowEntity windowEntity1 = new WindowEntity();
        windowEntity1.setId(1L);
        windowEntity1.setName("Window 1");

        WindowEntity windowEntity2 = new WindowEntity();
        windowEntity2.setId(2L);
        windowEntity2.setName("Window 2");

        roomEntity.setWindows(Set.of(windowEntity1, windowEntity2));

        Room room = RoomMapper.of(roomEntity);

        assertEquals(1L, room.id());
        assertEquals("Room 1", room.name());
        assertEquals(2, room.windows().size());
    }
}
