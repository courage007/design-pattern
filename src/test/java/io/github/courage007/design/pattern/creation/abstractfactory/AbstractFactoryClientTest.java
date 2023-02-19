package io.github.courage007.design.pattern.creation.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [AbstractFactoryClient测试类]
 *
 * @author: courage007
 * @date: 2023-02-19
 */
class AbstractFactoryClientTest {
    @Test
    void test1() {
        AbstractFactoryClient factoryClient = new AbstractFactoryClient(new ProductFactory1());
        factoryClient.foo();

        AbstractFactoryClient.foo(new ProductFactory2());
    }
}