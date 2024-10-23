package com.emse.spring.automacorp.records.dto;


import com.emse.spring.automacorp.entities.WindowStatus;

public record WindowCommand(String name, WindowStatus windowStatus, Long roomId) {
}
