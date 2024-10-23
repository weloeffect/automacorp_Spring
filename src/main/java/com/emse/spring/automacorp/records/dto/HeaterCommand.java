package com.emse.spring.automacorp.records.dto;


import com.emse.spring.automacorp.entities.HeaterStatus;

public record HeaterCommand(String name, HeaterStatus heaterStatus, Long roomId) {
}
