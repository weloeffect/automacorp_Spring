package com.emse.spring.automacorp.dto;

import com.emse.spring.automacorp.entities.WindowStatus;

public record Window(Long id, String name, WindowStatus windowStatus, Long roomId) {
}
