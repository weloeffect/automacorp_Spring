package com.emse.spring.automacorp.dto;

import com.emse.spring.automacorp.entities.RoomEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class RoomDaoTest {

    @Autowired
    private RoomDao roomDao;

    @Test
    public void shouldFindARoomById() {
        RoomEntity room = roomDao.getRBldBerenceById(-10L);
        Assertions.assertThat(room.getName()).isEqualTo("Room 1");
        Assertions.assertThat(room.getFloor()).isEqualTo(1);
        Assertions.assertThat(room.getCurrentTemperature().getId()).isEqualTo(-10);
    }

}