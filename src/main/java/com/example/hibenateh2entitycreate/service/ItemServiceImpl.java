package com.example.hibenateh2entitycreate.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.hibenateh2entitycreate.api.internal.ItemService;
import com.example.hibenateh2entitycreate.dto.ItemDto;
import com.example.hibenateh2entitycreate.persistance.entity.Item;
import com.example.hibenateh2entitycreate.persistance.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    @Override
    public List<ItemDto> getAll() {
        return repository.findAll().stream().map(Item::asDto).collect(Collectors.toList());
    }

    // ToDo lwojcik: throwing exception
    @Override
    public ItemDto getById(Long id) {
        return repository.findById(id).map(Item::asDto).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
