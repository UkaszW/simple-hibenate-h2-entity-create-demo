package com.example.hibenateh2entitycreate.api;

import java.util.List;

import com.example.hibenateh2entitycreate.api.internal.WarehouseService;
import com.example.hibenateh2entitycreate.dto.WarehouseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = ApiUrls.WAREHOUSE)
@RequiredArgsConstructor
public class WarehouseEndpoint {

    private final WarehouseService warehouseService;

    @GetMapping("/all")
    public List<WarehouseDto> getAll() {
        return warehouseService.getAll();
    }

    @GetMapping("/{id}")
    public WarehouseDto getById(@PathVariable Long id) {
        return warehouseService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        warehouseService.deleteById(id);
    }
}
