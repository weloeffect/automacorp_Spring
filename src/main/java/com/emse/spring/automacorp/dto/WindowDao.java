package com.emse.spring.automacorp.dto;


import com.emse.spring.automacorp.entities.WindowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindowDao extends JpaRepository<WindowEntity, Long>, WindowDaoCustom {
}