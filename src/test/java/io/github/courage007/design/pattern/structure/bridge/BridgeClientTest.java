package io.github.courage007.design.pattern.structure.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-05-29
 */
class BridgeClientTest {

    @Test
    void test1() {
        BridgeClient bridgeClient = new BridgeClient();
        bridgeClient.test();
    }
}