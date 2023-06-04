package io.github.courage007.design.pattern.structure.decorator;

/**
 * [装饰器]
 *
 * @date: 2023-06-04
 */
public class Decorator implements Component {
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
