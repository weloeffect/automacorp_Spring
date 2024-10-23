package com.emse.spring.automacorp.records.dao;

import java.util.List;

public record Room(Long id, String name, List<Window> windows) {
}
