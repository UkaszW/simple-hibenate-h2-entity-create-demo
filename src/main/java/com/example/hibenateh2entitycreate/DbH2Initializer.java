package com.example.hibenateh2entitycreate;

import java.util.Collection;
import java.util.Collections;

import com.example.hibenateh2entitycreate.persistance.entity.Item;
import com.example.hibenateh2entitycreate.persistance.entity.Warehouse;
import com.example.hibenateh2entitycreate.persistance.repository.ItemRepository;
import com.example.hibenateh2entitycreate.persistance.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

// FIXME

@Component
@RequiredArgsConstructor
public class DbH2Initializer {

    private final ItemRepository itemRepository;
    private final WarehouseRepository warehouseRepository;

    public void initSampleData() {
        addSampleItem();
    }

    private void addSampleItem() {
        Item item = new Item();
        item.setName("TEST_ITEM");
        item.setQuantity(1L);
        item.setWarehouse(addSampleWarehouse());
        itemRepository.save(item);
    }

    private Warehouse addSampleWarehouse() {
        Warehouse warehouse = new Warehouse();
        warehouse.setName("TEST_WAREHOUSE");
        return warehouseRepository.save(warehouse);
    }
}
