package com.kodilla.patterns.factory.task;

public final class Driving implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    private boolean isExecuted;

    public Driving(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;

        this.isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName + " to " + where + " by " + using);
        this.isExecuted = true;
    }


    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
