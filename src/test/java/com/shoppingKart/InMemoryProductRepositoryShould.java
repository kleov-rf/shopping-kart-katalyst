package com.shoppingKart;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryProductRepositoryShould {

    @Test
    void find_existing_product(){
        // arrange
        Product tomato = new Product("Tomato", 3.75);
        List<Product> availableProducts = new ArrayList<>(List.of(tomato));
        InMemoryProductRepository inMemoryProductRepository = new InMemoryProductRepository(availableProducts);

        // act
        Product foundProduct = inMemoryProductRepository.findProduct(tomato);

        // assert
        assertEquals(foundProduct, tomato);
    }

}