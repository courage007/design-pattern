package io.github.courage007.design.pattern.structure.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-04-08
 */
class ProxyClientTest {

    @Test
    void test1() {
        ProxyClient client = new ProxyClient();
        client.test();
    }
}