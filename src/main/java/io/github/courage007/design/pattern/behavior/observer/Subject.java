package io.github.courage007.design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * [目标类]
 *
 * @date: 2023-07-09
 */
public abstract class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        if (observerList == null || observerList.size() == 0) {
            return;
        }
        observerList.forEach(Observer::update);
    }

    public abstract void doSomething();
}
