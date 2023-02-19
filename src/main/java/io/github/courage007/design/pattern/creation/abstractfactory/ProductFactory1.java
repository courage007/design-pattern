package io.github.courage007.design.pattern.creation.abstractfactory;

/**
 * [产品工厂A]
 *
 * @date: 2023-02-14
 */
public class ProductFactory1 extends ProductFactory {
    @Override
    public ProductA createProductA() {
        System.out.println("create ProductA");
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("create ProductB");
        return new ConcreteProductB1();
    }
}
