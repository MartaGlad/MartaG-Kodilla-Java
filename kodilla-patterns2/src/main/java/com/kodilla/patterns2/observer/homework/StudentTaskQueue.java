package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskQueue implements Observable {
    private final String studentName;
    private final List<Observer> observers;
    private final List<String> tasks;

    public StudentTaskQueue(String studentName) {
        this.studentName = studentName;
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String Task) {
        tasks.add(Task);
        notifyObservers();
    }

    @Override
    public void registerObserver (Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
