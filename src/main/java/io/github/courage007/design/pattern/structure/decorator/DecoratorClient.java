package io.github.courage007.design.pattern.structure.decorator;

/**
 * [装饰器模式客户端]
 *
 * @date: 2023-06-04
 */
public class DecoratorClient {
    public void test() {
        Component component = new ConcreteComponent();
        component.operation();
        component = new ConcreteDecorator(component);
        component.operation();
    }
}
