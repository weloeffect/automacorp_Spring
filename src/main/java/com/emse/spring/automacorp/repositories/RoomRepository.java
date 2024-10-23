package com.emse.spring.automacorp.repositories;

import com.emse.spring.automacorp.entities.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
}