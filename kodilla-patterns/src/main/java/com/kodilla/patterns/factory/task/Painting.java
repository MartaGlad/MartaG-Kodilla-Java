package com.kodilla.patterns.factory.task;

public final class Painting implements Task {
    private final String taskName;
    private final String whatToPaint;
    private final String color;

    private boolean isExecuted;

    public Painting(final String taskName, final String whatToPaint, final String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;

        this.isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName + " " + whatToPaint + "\non color: " + color);
        this.isExecuted  = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

}
