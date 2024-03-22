package com.bookstore.service;

import com.bookstore.dto.ShoppingCartDto;
import com.bookstore.repository.ShoppingCartRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Transactional(readOnly=true)
    public List<ShoppingCartDto> allShoppingCart() {
        return shoppingCartRepository.fetchShoppingCart();
    }

    @Transactional(readOnly=true)
    public List<ShoppingCartDto> byPriceShoppingCart() {
        return shoppingCartRepository.fetchShoppingCartByPrice(40);
    }
}