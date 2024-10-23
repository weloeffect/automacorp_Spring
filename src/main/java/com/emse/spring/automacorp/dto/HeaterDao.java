package com.emse.spring.automacorp.dto;


import com.emse.spring.automacorp.entities.HeaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeaterDao extends JpaRepository<HeaterEntity, Long>, HeaterDaoCustom {
}
