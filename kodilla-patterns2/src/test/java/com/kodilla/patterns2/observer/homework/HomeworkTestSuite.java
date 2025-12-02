package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    void testUpdate() {
        //Given
        StudentTaskQueue student1Tasks = new StudentTaskQueue("Marta Jeż");
        StudentTaskQueue student2Tasks = new StudentTaskQueue("Piotr Panas");
        StudentTaskQueue student3Tasks = new StudentTaskQueue("Fenek Kamiński");

        Mentor mentor1 = new Mentor("Felicjan");
        Mentor mentor2 = new Mentor("Lucjan");

        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor1);
        student3Tasks.registerObserver(mentor2);

        //When
        student1Tasks.addTask("E1");
        student1Tasks.addTask("E2");
        student1Tasks.addTask("E3");
        student1Tasks.addTask("E4");

        student2Tasks.addTask("E1");
        student2Tasks.addTask("E2");

        student3Tasks.addTask("E1");
        student3Tasks.addTask("E2");
        student3Tasks.addTask("E3");
        student3Tasks.addTask("E4");
        student3Tasks.addTask("E5");
        student3Tasks.addTask("E6");
        student3Tasks.addTask("E7");
        student3Tasks.addTask("E8");

        //Then
        assertEquals(6, mentor1.getUpdateCount());
        assertEquals(8, mentor2.getUpdateCount());
    }
}
