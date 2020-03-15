package com.example.hibenateh2entitycreate.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.example.hibenateh2entitycreate.dto.ItemDto;
import lombok.Setter;

@Setter
@Entity
public class Item extends BaseEntity {

    private String name;
    private Long quantity;

    @NotNull
    @ManyToOne()
    private Warehouse warehouse;

    public ItemDto asDto() {
        return ItemDto.builder()
                      .id(getId())
                      .name(name)
                      .warehouseId(warehouse.getId())
                      .quantity(quantity)
                      .build();
    }
}
