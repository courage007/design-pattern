package io.github.courage007.design.pattern.creation.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-02-19
 */
class SimpleFactoryClientTest {

    @Test
    void test1() {
        SimpleFactoryClient simpleFactoryClient = new SimpleFactoryClient();
        simpleFactoryClient.test();
    }
}