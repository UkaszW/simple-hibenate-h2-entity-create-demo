package com.example.hibenateh2entitycreate.api.internal;

import java.util.List;

import com.example.hibenateh2entitycreate.dto.WarehouseDto;

public interface WarehouseService {

    List<WarehouseDto> getAll();

    WarehouseDto getById(Long id);

    void deleteById(Long id);
}
