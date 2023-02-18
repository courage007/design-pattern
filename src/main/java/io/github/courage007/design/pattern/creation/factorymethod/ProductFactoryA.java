package io.github.courage007.design.pattern.creation.factorymethod;

/**
 * [产品工厂A]
 *
 * @date: 2023-02-14
 */
public class ProductFactoryA extends ProductFactory {
    @Override
    public Product create() {
        System.out.println("create ProductA");
        return new ConcreteProductA();
    }
}
