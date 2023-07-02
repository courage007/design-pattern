package io.github.courage007.design.pattern.behavior.strategy;

/**
 * [具体策略类B]
 *
 * @date: 2023-07-02
 */
public class ConcreteBStrategy implements IStrategy {
    @Override
    public void operation(String paramStr) {
        System.out.println("do some thing in the concrete B instance");
    }
}
