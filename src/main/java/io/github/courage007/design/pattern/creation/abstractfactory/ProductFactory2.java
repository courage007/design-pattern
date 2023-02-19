package io.github.courage007.design.pattern.creation.abstractfactory;

/**
 * [产品工厂B]
 *
 * @date: 2023-02-14
 */
public class ProductFactory2 extends ProductFactory {
    @Override
    public ProductA createProductA() {
        System.out.println("create ProductB");
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("create ProductB");
        return new ConcreteProductB2();
    }
}
