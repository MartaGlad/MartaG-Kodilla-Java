package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapesList = new ArrayList<>();

    public List<Shape> getShapesList() {
        return shapesList;
    }

    public int getShapesQuantity() {
        return shapesList.size();
    }

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapesList.size()) {
            return shapesList.get(n);
        }
        return null;
    }

    public String showFigures() {
        StringBuilder sb = new StringBuilder();
        if (!shapesList.isEmpty()) {
            for (Shape shape : shapesList) {
                sb.append(shape.getShapeName() + ", ");
            }
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }
}
