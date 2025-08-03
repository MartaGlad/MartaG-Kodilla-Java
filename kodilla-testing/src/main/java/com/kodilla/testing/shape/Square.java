package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String shapeName;
    private double a;

    public Square(String shapeName, double a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(a, square.a) == 0 && Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, a);
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return a * a;
    }
}
