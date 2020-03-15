package com.example.hibenateh2entitycreate.persistance.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.hibenateh2entitycreate.dto.WarehouseDto;
import lombok.Setter;

@Setter
@Entity
public class Warehouse extends BaseEntity {

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "warehouse_id")
    private Set<Item> items;

    public WarehouseDto asDto() {
        var itemIds = items.stream().map(BaseEntity::getId).collect(Collectors.toSet());
        return WarehouseDto.builder()
                           .id(getId())
                           .name(name)
                           .itemIds(itemIds)
                           .build();
    }
}
