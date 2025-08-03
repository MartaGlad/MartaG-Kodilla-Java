package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String shapeName;
    private double a;
    private double h;

    public Triangle(String shapeName, double a, double h) {
        this.shapeName = shapeName;
        this.a = a;
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(a, triangle.a) == 0 && Double.compare(h, triangle.h) == 0 && Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, a, h);
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return a * h * 0.5;
    }
}
