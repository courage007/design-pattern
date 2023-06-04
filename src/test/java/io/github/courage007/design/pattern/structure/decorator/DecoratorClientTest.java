package io.github.courage007.design.pattern.structure.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-06-04
 */
class DecoratorClientTest {

    @Test
    void test1() {
        DecoratorClient client = new DecoratorClient();
        client.test();
    }
}