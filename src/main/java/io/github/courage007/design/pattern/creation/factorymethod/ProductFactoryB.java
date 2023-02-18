package io.github.courage007.design.pattern.creation.factorymethod;

/**
 * [产品工厂B]
 *
 * @date: 2023-02-14
 */
public class ProductFactoryB extends ProductFactory {
    @Override
    public Product create() {
        System.out.println("create ProductB");
        return new ConcreteProductB();
    }
}
