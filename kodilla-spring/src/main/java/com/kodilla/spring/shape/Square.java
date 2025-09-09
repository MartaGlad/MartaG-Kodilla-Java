package com.kodilla.spring.shape;

//nie ma @Component, bo jest tworzony bean w ShapesFactory
public class Square implements Shape {
    @Override
    public String getShapeName() {
        return "This is a square.";
    }
}
