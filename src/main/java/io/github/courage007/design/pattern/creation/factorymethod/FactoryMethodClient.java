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

    // 调用方式一：方法中实例化工厂子类
    public void test() {
        ProductFactory productFactoryA = new ProductFactoryA();
        Product productA = productFactoryA.create();
        productA.function();
        ProductFactory productFactoryB = new ProductFactoryB();
        Product productB = productFactoryB.create();
        productB.function();
    }

    // 调用方式二：工厂对象作为方法参数(工具类方法)
    public void foo(ProductFactory factory) {
        Product productA = factory.create();
        productA.function();
    }

    // 调用方式三：使用构造函数中传入的工厂(工厂一旦绑定，无法修改)
    public void foo() {
        Product productA = this.factory.create();
        productA.function();
    }
}
