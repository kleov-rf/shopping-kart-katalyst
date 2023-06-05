package com.shoppingKart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryProductRepositoryShould {

    @Test
    void find_existing_product(){
        // arrange
        Product tomato = new Product("Tomato", 3.75);
        InMemoryProductRepository inMemoryProductRepository = new InMemoryProductRepository();

        // act
        Product foundProduct = inMemoryProductRepository.findProduct(tomato);

        // assert
        assertEquals(foundProduct, tomato);
    }

}