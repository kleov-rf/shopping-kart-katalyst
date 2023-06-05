package com.shoppingKart;

import com.shoppingKart.Product;

public class ShoppingCartService {
    private final ProductRepository productRepository;

    public ShoppingCartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addItem(Product productFilter) {
        this.productRepository.findProduct(productFilter);
    }

    public String printShoppingCart() {
        return null;
    }
}
