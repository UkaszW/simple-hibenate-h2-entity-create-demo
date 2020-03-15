package com.example.hibenateh2entitycreate.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ItemDto implements Serializable {

    private static final long serialVersionUID = -307820624965180995L;

    private Long id;
    private String name;
    private Long warehouseId;
    private Long quantity;
}
