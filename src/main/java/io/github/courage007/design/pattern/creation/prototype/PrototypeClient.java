package io.github.courage007.design.pattern.creation.prototype;

/**
 * [原型模式客户端]
 *
 * @date: 2023-02-14
 */
public class PrototypeClient {
    public PrototypeClient() {

    }

    // 调用方式：调用具体原型实例的克隆方法
    public void test() {
        Prototype concretePrototype = new ConcretePrototype("foo");
        ConcretePrototype clonedPrototype = (ConcretePrototype) concretePrototype.clone();
        System.out.println(clonedPrototype.getField());
    }
}
