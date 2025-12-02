package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable { //poddawane obserwacji
    private final String name;
    private final List<Observer> observers;
    private final List<String> messages;

    public ForumTopic(String name) {
        this.name = name;
        observers = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
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
