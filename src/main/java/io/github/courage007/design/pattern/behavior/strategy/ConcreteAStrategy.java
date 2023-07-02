package io.github.courage007.design.pattern.behavior.strategy;

/**
 * [具体策略类A]
 *
 * @date: 2023-07-02
 */
public class ConcreteAStrategy implements IStrategy {
    @Override
    public void operation(String paramStr) {
        System.out.println("do some thing in the concrete A instance");
    }
}
