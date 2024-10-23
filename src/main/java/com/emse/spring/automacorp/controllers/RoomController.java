package com.emse.spring.automacorp.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> findAll() {
        return roomService.findAll().stream()
                .map(RoomMapper::of)
                .toList();
    }

    @GetMapping("/{id}")
    public Room findById(@PathVariable Long id) {
        return roomService.findById(id).map(RoomMapper::of).orElse(null);
    }

    @PostMapping
    public Room create(@RequestBody RoomEntity roomEntity) {
        return RoomMapper.of(roomService.create(roomEntity));
    }

    @PutMapping("/{id}")
    public Room update(@PathVariable Long id, @RequestBody RoomEntity roomEntity) {
        return RoomMapper.of(roomService.update(id, roomEntity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        roomService.delete(id);
    }
}
