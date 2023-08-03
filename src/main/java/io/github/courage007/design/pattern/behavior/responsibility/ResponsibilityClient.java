package io.github.courage007.design.pattern.behavior.responsibility;

/**
 * [责任链模式客户端]
 *
 * @date: 2023-08-03
 */
public class ResponsibilityClient {
    public void test() {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handleRequest();
    }
}
