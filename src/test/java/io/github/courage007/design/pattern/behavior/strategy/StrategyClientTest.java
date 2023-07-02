package io.github.courage007.design.pattern.behavior.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-07-02
 */
class StrategyClientTest {

    @Test
    void test1() {
        StrategyClient strategyClient = new StrategyClient();
        strategyClient.test();
    }
}