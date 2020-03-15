package com.example.hibenateh2entitycreate.dto;

import java.io.Serializable;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WarehouseDto implements Serializable {

    private static final long serialVersionUID = 7996544756319248925L;

    private Long id;
    private String name;
    private Set<Long> itemIds;
}
