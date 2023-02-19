package io.github.courage007.design.pattern.creation.abstractfactory;

/**
 * [产品工厂基类]
 *
 * @date: 2023-02-14
 */
public abstract class ProductFactory {
    /**
     * 生产产品A
     */
    abstract ProductA createProductA();

    /**
     * 生产产品B
     */
    abstract ProductB createProductB();
}
