package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    /**
     * Add to shopping cart
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * Show shopping cart
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * Clean shopping cart
     */
    void cleanShoppingCart();

    /**
     * Sub one item from shopping cart
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
