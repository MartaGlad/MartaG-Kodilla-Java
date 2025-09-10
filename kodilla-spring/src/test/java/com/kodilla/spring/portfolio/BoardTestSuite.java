package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("TaskToDo1");
        board.getInProgressList().addTask("TaskInProgres1");
        board.getDoneList().addTask("TaskDone1");
        //Then
        System.out.println("Added task to tastToDoList: "+board.getToDoList().getTasks().get(0));
        System.out.println("Added task to tastInProgressList: "+board.getInProgressList().getTasks().get(0));
        System.out.println("Added task to tastToDoList: "+board.getDoneList().getTasks().get(0));

    }
}
