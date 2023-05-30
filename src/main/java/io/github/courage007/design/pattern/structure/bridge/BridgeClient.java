package io.github.courage007.design.pattern.structure.bridge;

/**
 * [桥接模式客户端]
 *
 * @date: 2023-05-29
 */
public class BridgeClient {
    public void test() {
        Abstraction abstraction1 = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction1.operation();
        Abstraction abstraction2 = new RefinedAbstraction(new ConcreteImplementorB());
        abstraction2.operation();
    }
}
