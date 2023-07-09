package io.github.courage007.design.pattern.behavior.observer;

/**
 * [具体观察者类]
 *
 * @date: 2023-07-09
 */
public class ConcreteObserver extends Observer {
    public void update() {
        super.update();
        doSomething();
    }

    private void doSomething() {
        System.out.println("I am a concrete observer instance");
    }
}
