package io.github.courage007.design.pattern.structure.decorator;

/**
 * [装饰器实现类]
 *
 * @date: 2023-06-04
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        afterOperation();
    }

    private void afterOperation() {
        System.out.printf("do some thing after operation in the concrete decorator");
    }
}
