package com.emse.spring.automacorp.dto;


import com.emse.spring.automacorp.entities.BuildingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingDao extends JpaRepository<BuildingEntity, Long> {
}
