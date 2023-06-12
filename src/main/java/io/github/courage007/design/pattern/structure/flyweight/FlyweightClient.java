package io.github.courage007.design.pattern.structure.flyweight;

/**
 * [外观模式客户端]
 *
 * @date: 2023-06-04
 */
public class FlyweightClient {
    public void test() {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("one");
        flyweight1.operation("one");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("one");
        flyweight2.operation("one");
        Flyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight("two");
        unsharedConcreteFlyweight.operation("two");
    }
}
