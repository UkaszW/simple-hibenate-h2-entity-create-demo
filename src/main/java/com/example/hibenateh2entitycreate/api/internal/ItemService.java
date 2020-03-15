package com.example.hibenateh2entitycreate.api.internal;

import java.util.List;

import com.example.hibenateh2entitycreate.dto.ItemDto;

public interface ItemService {

    List<ItemDto> getAll();

    ItemDto getById(Long id);

    void deleteById(Long id);
}
