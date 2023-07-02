package io.github.courage007.design.pattern.behavior.strategy;

/**
 * [策略模式客户端]
 *
 * @date: 2023-07-02
 */
public class StrategyClient {
    public void test() {
        StrategyContext strategyContextA = new StrategyContext(new ConcreteAStrategy());
        strategyContextA.doSomething("TEST");
        StrategyContext strategyContextB = new StrategyContext();
        strategyContextB.doSomething("type B", "TEST");
    }
}
