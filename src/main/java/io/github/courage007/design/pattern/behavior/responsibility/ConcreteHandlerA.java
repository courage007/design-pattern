package io.github.courage007.design.pattern.behavior.responsibility;

/**
 * [具体处理器A]
 *
 * @date: 2023-08-03
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("I am a concrete handler A instance");
        doNext();
    }
}
