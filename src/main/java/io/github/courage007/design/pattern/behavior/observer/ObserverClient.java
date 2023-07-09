package io.github.courage007.design.pattern.behavior.observer;

/**
 * [观察者模式客户端]
 *
 * @date: 2023-07-09
 */
public class ObserverClient {
    public void test() {
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Subject subject = new ConcreteSubject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.doSomething();
        subject.detach(observer2);
        subject.doSomething();
    }
}
