package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza crust tomato sauce cheese", description);
    }

    @Test
    void testExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    void testExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza crust tomato sauce cheese + extra cheese", description);
    }

    @Test
    void testExtraCheeseHamMushroomsExpressDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ExpressDeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(33), calculatedCost);
    }

    @Test
    void testExtraCheeseHamMushroomsExpressDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ExpressDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza crust tomato sauce cheese + extra cheese + ham + mushrooms express delivery service", description);
    }
}
