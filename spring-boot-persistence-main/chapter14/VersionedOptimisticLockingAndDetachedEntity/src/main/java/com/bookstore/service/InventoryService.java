package com.bookstore.service;

import com.bookstore.entity.Inventory;
import com.bookstore.repository.InventoryRepository;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory firstTransactionFetchesAndReturn() {
        Inventory firstInventory = inventoryRepository.findById(1L).orElseThrow();

        return firstInventory;
    }

    @Transactional
    public void secondTransactionFetchesAndReturn() {
        Inventory secondInventory = inventoryRepository.findById(1L).orElseThrow();

        secondInventory.setQuantity(secondInventory.getQuantity() - 1);
    }

    public void thirdTransactionMergesAndUpdates(Inventory firstInventory) {
        // calls EntityManager#merge() behind the scene
        inventoryRepository.save(firstInventory);

        // this ends up in optimistic locking exception
    }
}