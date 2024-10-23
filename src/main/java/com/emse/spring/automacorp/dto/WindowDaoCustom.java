package com.emse.spring.automacorp.dto;



import com.emse.spring.automacorp.entities.WindowEntity;

import java.util.List;

public interface WindowDaoCustom {
    List<WindowEntity> findRoomsWithOpenWindows(Long id);
    List<WindowEntity> findAllWindowsByRoomName(String roomName);
    void deleteByRoom(Long id);
    void closeAllWindowsByRoom(Long id);
    void openAllWindowsByRoom(Long id);
}