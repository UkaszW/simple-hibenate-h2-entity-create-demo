package com.example.hibenateh2entitycreate.persistance.repository;

import com.example.hibenateh2entitycreate.persistance.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
