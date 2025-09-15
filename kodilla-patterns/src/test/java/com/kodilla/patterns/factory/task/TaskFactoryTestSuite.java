package com.kodilla.patterns.factory.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("trip", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testTaskFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("decorating", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testTaskFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals("Christmas shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());

    }
}
