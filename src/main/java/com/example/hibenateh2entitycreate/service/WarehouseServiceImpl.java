package com.example.hibenateh2entitycreate.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.hibenateh2entitycreate.api.internal.WarehouseService;
import com.example.hibenateh2entitycreate.dto.WarehouseDto;
import com.example.hibenateh2entitycreate.persistance.entity.Warehouse;
import com.example.hibenateh2entitycreate.persistance.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepository repository;

    @Override
    public List<WarehouseDto> getAll() {
        return repository.findAll().stream().map(Warehouse::asDto).collect(Collectors.toList());
    }

    // ToDo lwojcik: throwing exception
    @Override
    public WarehouseDto getById(Long id) {
        return repository.findById(id).map(Warehouse::asDto).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
