package com.example.hibenateh2entitycreate.api;

import java.util.List;

import com.example.hibenateh2entitycreate.api.internal.ItemService;
import com.example.hibenateh2entitycreate.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = ApiUrls.ITEM)
@RequiredArgsConstructor
public class ItemEndpoint {

    private final ItemService itemService;

    @GetMapping("/all")
    public List<ItemDto> getAll() {
        return itemService.getAll();
    }

    @GetMapping("/{id}")
    public ItemDto getById(@PathVariable Long id) {
        return itemService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        itemService.deleteById(id);
    }
}
