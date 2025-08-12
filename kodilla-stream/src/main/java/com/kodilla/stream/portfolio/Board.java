package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    private final String name;
    private final List<TaskList> taskLists = new ArrayList<>();

    public Board(final String name) {
        this.name = name;
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", taskLists=" + taskLists +
                '}';
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public boolean removeTaskList(List<TaskList> taskList) {
         return taskLists.remove(taskList);
    }
}
