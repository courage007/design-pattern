package io.github.courage007.design.pattern.behavior.observer;

/**
 * [具体目标类]
 *
 * @date: 2023-07-09
 */
public class ConcreteSubject extends Subject {
    public void doSomething() {
        notifyObserver();
    }
}
