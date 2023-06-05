package com.shoppingKart;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@ExtendWith(MockitoExtension.class)
class ShoppingCartServiceShould {

   @Mock
    private ProductRepository productRepository;

    @Test
    void add_an_existing_product_to_the_shoppingcart(){
        ShoppingCartService shoppingCartService = new ShoppingCartService(productRepository);
        Product tomato = new Product("Tomato", 3.75);

        shoppingCartService.addItem(tomato);

        verify(productRepository, times(1)).findProduct(tomato);
    }

}