package com.kodilla.patterns.factory.shape;

public final class ShapeFactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass) {
       /* switch (shapeClass) {
            case "CIRCLE":
                return new Circle("The rounded circle ", 4.50);
            case "SQUARE":
                return new Square("The angular square ", 7.0);
            case "RECTANGLE":
                return new Rectangle("The long rectangle ", 15.0, 2.5);
            default:
                return null;

        }*/

        return switch (shapeClass) {
            case CIRCLE -> new Circle("The rounded circle", 4.50);
            case SQUARE -> new Square("The angular square", 7.0);
            case RECTANGLE -> new Rectangle("The long rectangle", 15.0,2.5);
            default -> null;
        };
    }
}
