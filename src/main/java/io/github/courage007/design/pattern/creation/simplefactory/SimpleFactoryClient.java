package io.github.courage007.design.pattern.creation.simplefactory;

/**
 * [工厂方法客户端]
 *
 * @date: 2023-02-14
 */
public class SimpleFactoryClient {
    public void test() {
        Product productA = ProductFactory.create(ConcreteProductA.class.getName());
        productA.function();

        Product productB = ProductFactory.create(ConcreteProductB.class.getName());
        productB.function();
    }
}
