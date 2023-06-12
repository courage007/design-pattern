package io.github.courage007.design.pattern.structure.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-06-06
 */
class FlyweightClientTest {
    @Test
    void test1() {
        FlyweightClient flyweightClient = new FlyweightClient();
        flyweightClient.test();
    }
}