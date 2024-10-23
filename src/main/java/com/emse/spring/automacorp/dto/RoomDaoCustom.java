package com.emse.spring.automacorp.dto;



import com.emse.spring.automacorp.entities.RoomEntity;

import java.util.List;

public interface RoomDaoCustom {
    List<RoomEntity> findAllRoomsByBuildingName(String buildingName);
}