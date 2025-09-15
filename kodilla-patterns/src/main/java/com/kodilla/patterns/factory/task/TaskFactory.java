package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING -> new Driving("trip", "airport", "car");
            case PAINTING -> new Painting("decorating", "dining rooom","orange");
            case SHOPPING -> new Shopping("Christmas shopping", "present", 20);
            default -> null;
        };
    }

}


