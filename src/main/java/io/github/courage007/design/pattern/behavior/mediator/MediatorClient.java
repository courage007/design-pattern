package io.github.courage007.design.pattern.behavior.mediator;


/**
 * [中介者模式客户端]
 *
 * @date: 2023-08-05
 */
public class MediatorClient {
    public void test() {
        IMediator mediator = new ConcreteMediator();
        Component componentA = new ConcreteComponentA(mediator);
        Component componentB = new ConcreteComponentB(mediator);
        Component componentC = new ConcreteComponentC(mediator);
        Component componentD = new ConcreteComponentD(mediator);
        componentA.send("i am a", componentB);
        componentB.send("i am b", componentC);
        componentC.send("i am c", componentD);
        componentD.send("i am d", componentA);
    }
}
