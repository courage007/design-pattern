package io.github.courage007.design.pattern.behavior.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-07-09
 */
class ObserverClientTest {
    @Test
    void test1() {
        ObserverClient observerClient = new ObserverClient();
        observerClient.test();
    }
}