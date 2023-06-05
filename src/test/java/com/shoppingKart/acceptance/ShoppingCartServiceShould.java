package com.shoppingKart.acceptance;

import com.shoppingKart.InMemoryProductRepository;
import com.shoppingKart.Product;
import com.shoppingKart.ProductRepository;
import com.shoppingKart.ShoppingCartService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartServiceShould {

    @Test
    void add_product_to_shopping_cart() {
        ProductRepository productRepository = new InMemoryProductRepository();
        ShoppingCartService shoppingCartService = new ShoppingCartService(productRepository);
        Product iceberg = new Product("Iceberg", 2.17);
        Product tomato = new Product("Tomato", 3.75);

        shoppingCartService.addItem(iceberg);
        shoppingCartService.addItem(tomato);

        String currentShoppingCartState = shoppingCartService.printShoppingCart();
        String expectedOutput = "Iceberg - 2.17 €7\n"
                + "Tomato - 3.75 €\n" + "TOTAL PRODUCTS: 2\n"
                + "TOTAL PRICE: 5.92 €";
        assertEquals(expectedOutput, currentShoppingCartState);
    }
}