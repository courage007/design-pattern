package io.github.courage007.design.pattern.behavior.templatemethod;

/**
 * [具体实现类B]
 *
 * @date: 2023-08-05
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    protected void operation1() {
        System.out.println("operation1 in a ConcreteClassB instance");
    }

    @Override
    protected void operation2() {
        System.out.println("operation2 in a ConcreteClassB instance");
    }
}
