package com.emse.spring.automacorp.controllers;


import com.emse.spring.automacorp.dto.Window;
import com.emse.spring.automacorp.services.WindowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/windows")
public class WindowController {

    private final WindowService windowService;

    public WindowController(WindowService windowService) {
        this.windowService = windowService;
    }

    @GetMapping
    public List<Window> findAll() {
        return windowService.findAll();
    }

    @GetMapping("/{id}")
    public Window findById(@PathVariable Long id) {
        return windowService.findById(id).orElse(null);
    }

    @PostMapping
    public Window create(@RequestBody Window window) {
        return windowService.create(window);
    }

    @PutMapping("/{id}")
    public Window update(@PathVariable Long id, @RequestBody Window window) {
        return windowService.update(id, window);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        windowService.deleteWindow(id);
    }
}