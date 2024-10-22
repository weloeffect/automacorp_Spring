package com.emse.spring.automacorp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "SP_SENSOR")
public class SensorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "sensor_value", nullable = false)
    private Double value;

    @Column(name = "sensor_type", nullable = false)
    private String sensorType;

    public SensorType getSensorType() {
        return SensorType.valueOf(sensorType);
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType.name();
    }

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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
