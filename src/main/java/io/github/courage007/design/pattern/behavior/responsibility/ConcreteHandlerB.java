package io.github.courage007.design.pattern.behavior.responsibility;

/**
 * [具体处理器B]
 *
 * @date: 2023-08-03
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("I am a concrete handler B instance");
        doNext();
    }
}
