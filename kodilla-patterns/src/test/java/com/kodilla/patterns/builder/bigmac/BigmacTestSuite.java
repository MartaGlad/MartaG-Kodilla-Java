package com.kodilla.patterns.builder.bigmac;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.SESAME_FREE)
                .burgers(2)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.LETTUCE)
                .ingredient(Ingredient.CHILLI_PEPPER)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngrediens = bigmac.getIngredients().size();
        //Then
        assertEquals(howManyIngrediens,3);
    }
}
