package io.github.courage007.design.pattern.creation.factorymethod;

/**
 * [工厂方法客户端]
 *
 * @date: 2023-02-14
 */
public class FactoryMethodClient {
    private ProductFactory factory;

    public FactoryMethodClient() {

    }

    public FactoryMethodClient(ProductFactory factory) {
        this.factory = factory;
    }

    public void test() {
        ProductFactory productFactoryA = new ProductFactoryA();
        Product productA = productFactoryA.create();
        productA.function();
        ProductFactory productFactoryB = new ProductFactoryB();
        Product productB = productFactoryB.create();
        productB.function();
    }

    public void foo(ProductFactory factory) {
        Product productA = factory.create();
        productA.function();
    }

    public void foo() {
        Product productA = this.factory.create();
        productA.function();
    }
}
