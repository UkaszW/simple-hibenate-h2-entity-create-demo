package com.example.hibenateh2entitycreate.persistance.repository;

import com.example.hibenateh2entitycreate.persistance.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
