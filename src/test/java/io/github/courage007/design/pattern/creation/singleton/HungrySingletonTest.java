package io.github.courage007.design.pattern.creation.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-03-05
 */
class HungrySingletonTest {

    @Test
    void getInstance() {
        HungrySingleton instance = HungrySingleton.getInstance();
    }
}