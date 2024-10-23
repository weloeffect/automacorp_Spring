package com.emse.spring.automacorp.repositories;

public interface SensorRepository extends JpaRepository<SensorEntity, Long> {
    List<SensorEntity> findBySensorType(SensorType sensorType);
}
