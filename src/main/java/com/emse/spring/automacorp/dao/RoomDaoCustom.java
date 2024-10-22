package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.entities.RoomEntity;

import java.util.List;

public interface RoomDaoCustom {
    List<RoomEntity> findAllRoomsByBuildingName(String buildingName);
}