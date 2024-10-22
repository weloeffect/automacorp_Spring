package com.emse.spring.automacorp.entities;

import jakarta.persistence.*;

import java.util.Set;

import static java.util.Set.*;

@Entity // (1).
@Table(name = "SP_ROOM") // (2).
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private Set<WindowEntity> windows;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<WindowEntity> getWindows() {
        return windows;
    }

    public void setWindows(Set<WindowEntity> windows) {
        this.windows = windows;
    }


}