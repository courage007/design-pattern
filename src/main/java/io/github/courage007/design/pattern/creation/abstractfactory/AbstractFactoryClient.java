package io.github.courage007.design.pattern.creation.abstractfactory;

/**
 * [抽象工厂客户端]
 *
 * @date: 2023-02-14
 */
public class AbstractFactoryClient {
    private ProductFactory factory;

    public AbstractFactoryClient(ProductFactory factory) {
        this.factory = factory;
    }

    // 调用方式一：方法中实例化工厂子类
    public void test() {
        ProductFactory productFactory1 = new ProductFactory1();
        ProductA productA1 = productFactory1.createProductA();
        productA1.function();
        ProductB productB1 = productFactory1.createProductB();
        productB1.foo();
        ProductFactory productFactory2 = new ProductFactory2();
        ProductA productA2 = productFactory2.createProductA();
        productA2.function();
        ProductB productB2 = productFactory2.createProductB();
        productB2.foo();
    }

    // 调用方式二：工厂对象作为方法参数(工具类方法)
    public static void foo(ProductFactory factory) {
        ProductA productA1 = factory.createProductA();
        productA1.function();
        ProductB productB1 = factory.createProductB();
        productB1.foo();
    }

    // 调用方式三：使用构造函数中传入的工厂(工厂一旦绑定，无法修改)
    public void foo() {
        ProductA productA1 = this.factory.createProductA();
        productA1.function();
        ProductB productB1 = this.factory.createProductB();
        productB1.foo();
    }
}
