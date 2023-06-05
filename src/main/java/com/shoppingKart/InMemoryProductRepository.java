package com.shoppingKart;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {
    private List<Product> availableProducts;

    public InMemoryProductRepository() {
        this.availableProducts = new ArrayList<>();
    }

    public InMemoryProductRepository(List<Product> availableProducts) {
        this.availableProducts = availableProducts;
    }

    @Override
    public Product findProduct(Product tomato) {
        Product product = null;
        for (Product availableProduct : availableProducts) {
            if (availableProduct.equals(tomato)) {
                product = availableProduct;
                break;
            }
        }
        return product;
    }
}
