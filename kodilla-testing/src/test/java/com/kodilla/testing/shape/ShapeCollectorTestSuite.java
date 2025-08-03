package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Circle")
    class TestCircle {
        @Test
        void testAddCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theCircle = new Circle("Kolo", 10);
            //When
            shapeCollector.addFigure(theCircle);
            //Then
            assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveCircleNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theCircle = new Circle("Kolo", 10);
            //When
            boolean result = shapeCollector.removeFigure(theCircle);
            //Then
            assertFalse(result);
        }

        @Test
        void testRemoveCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theCircle = new Circle("Kolo", 10);
            shapeCollector.addFigure(theCircle);
            //When
            boolean result = shapeCollector.removeFigure(theCircle);
            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Test
        void testGetCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theCircle = new Circle("Kolo", 10);
            shapeCollector.addFigure(theCircle);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(theCircle, retrievedShape);
        }
    }


    @Nested
    @DisplayName("Tests for Square")
    class TestSquare {
        @Test
        void testAddSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theSquare = new Square("Kwadrat", 10);
            //When
            shapeCollector.addFigure(theSquare);
            //Then
            assertEquals(1, shapeCollector.getShapesQuantity());

        }

        @Test
        void testRemoveSquareNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theSquare = new Square("Kwadrat", 10);
            //When
            boolean result = shapeCollector.removeFigure(theSquare);
            //Then
            assertFalse(result);

        }

        @Test
        void testRemoveSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theSquare = new Square("Kwadrat", 10);
            shapeCollector.addFigure(theSquare);
            //When
            boolean result = shapeCollector.removeFigure(theSquare);
            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());

        }

        @Test
        void testGetSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theSquare = new Square("Kolo", 10);
            shapeCollector.addFigure(theSquare);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(theSquare, retrievedShape);

        }
    }


    @Nested
    @DisplayName("Tests for Triangle")
    class TestTriangle {
        @Test
        void testAddTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theTriangle = new Triangle("Trojkat", 10, 5);
            //When
            shapeCollector.addFigure(theTriangle);
            //Then
            assertEquals(1, shapeCollector.getShapesQuantity());

        }

        @Test
        void testRemoveTriangleNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theTriangle = new Triangle("Trojkat", 10, 5);
            //When
            boolean result = shapeCollector.removeFigure(theTriangle);
            //Then
            assertFalse(result);

        }

        @Test
        void testRemoveTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theTriangle = new Triangle("Trojkat", 10, 5);
            shapeCollector.addFigure(theTriangle);
            //When
            boolean result = shapeCollector.removeFigure(theTriangle);
            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());

        }

        @Test
        void testGetTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape theTriangle = new Triangle("Trojkat", 10, 5);
            shapeCollector.addFigure(theTriangle);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(theTriangle, retrievedShape);

        }
    }


    @Test
    void showFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape theCircle = new Circle("Kolo", 10);
        Shape theSquare = new Square("Kwadrat", 10);
        Shape theTriangle = new Triangle("Trojkat", 10, 5);
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theTriangle);
        //When
        String names = shapeCollector.showFigures();
        //Then
        assertEquals("Kolo, Kwadrat, Trojkat", names);

    }
}
