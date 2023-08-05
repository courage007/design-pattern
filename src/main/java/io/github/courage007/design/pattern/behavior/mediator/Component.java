package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [抽象类]
 *
 * @date: 2023-08-05
 */
public abstract class AbstractClass {
    public final void templateMethod() {
        operation1();
        operation2();
    }

    protected abstract void operation1();

    protected abstract void operation2();
}
