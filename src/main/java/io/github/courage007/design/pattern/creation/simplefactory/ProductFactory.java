package io.github.courage007.design.pattern.creation.simplefactory;

/**
 * [产品工厂基类]
 *
 * @date: 2023-02-14
 */
public class ProductFactory {
    /**
     * 生产产品
     */
    public static Product create(String productName) {
        if (productName.contains("ConcreteProductA")) {
            return new ConcreteProductA();
        }
        if (productName.contains("ConcreteProductB")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
