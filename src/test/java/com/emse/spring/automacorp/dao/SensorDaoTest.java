package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.entities.SensorEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class SensorDaoTest {

    @Autowired
    private SensorDao sensorDao;

    @Test
    public void shouldFindASensorByID(){
        SensorEntity sensor = sensorDao.getReferenceById(-7L);
        Assertions.assertThat(sensor.getName()).isEqualTo("Window 1 status room 2");
    }
}