package com.emse.spring.automacorp.dto;


import com.emse.spring.automacorp.entities.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDao extends JpaRepository<RoomEntity, Long>, RoomDaoCustom {
}
