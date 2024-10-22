package com.example.application.dto;

import com.example.application.entity.WindowStatus;

public record Window(Long id, String name, WindowStatus windowStatus, Long roomId) {
}
