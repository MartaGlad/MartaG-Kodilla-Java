package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String shapeName;
    private double r;

    public Circle(String shapeName,double r) {
        this.shapeName = shapeName;
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(r, circle.r) == 0 && Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, r);
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return 3.14 * r * r;
    }
}
