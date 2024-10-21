package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.SensorEntity;

import java.util.List;

public interface SensorCustomDao {
    List<SensorEntity> findBySiteText(String searchText);
}