package io.github.courage007.design.pattern.creation.prototype;

import io.github.courage007.design.pattern.creation.simplefactory.SimpleFactoryClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-03-20
 */
class PrototypeClientTest {
    @Test
    void test() {
        PrototypeClient prototypeClient = new PrototypeClient();
        prototypeClient.test();
    }
}