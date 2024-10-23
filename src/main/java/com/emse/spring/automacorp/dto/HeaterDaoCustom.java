package com.emse.spring.automacorp.dto;



import com.emse.spring.automacorp.entities.HeaterEntity;

import java.util.List;

public interface HeaterDaoCustom {
    List<HeaterEntity> findAllHeatersByRoomName(String roomName);
    void deleteByRoom(Long roomId);
    void offAllHeatersByRoom(Long id);
    void onAllHeatersByRoom(Long id);
}
