package io.github.courage007.design.pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * [策略上下文]
 *
 * @date: 2023-07-02
 */
public class StrategyContext {
    private static final Map<String, IStrategy> STRATEGY_MAP;

    private IStrategy strategy;

    static {
        STRATEGY_MAP = new HashMap<>();
        STRATEGY_MAP.put("type A", new ConcreteAStrategy());
        STRATEGY_MAP.put("type B", new ConcreteBStrategy());
    }

    public StrategyContext() {

    }

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething(String paramStr) {
        strategy.operation(paramStr);
    }

    public void doSomething(String strategyType, String paramStr) {
        IStrategy currentStrategy = STRATEGY_MAP.get(strategyType);
        if (Objects.isNull(currentStrategy)) {
            throw new RuntimeException("strategy is null");
        }
        currentStrategy.operation(paramStr);
    }
}
