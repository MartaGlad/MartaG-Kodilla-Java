package com.kodilla.patterns.factory.task;

public final class Shopping implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    private boolean isExecuted;

    public Shopping(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;

        this.isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName +
                "\nproduct: " + whatToBuy + "\nin quantity: " + quantity);
        this.isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

}
