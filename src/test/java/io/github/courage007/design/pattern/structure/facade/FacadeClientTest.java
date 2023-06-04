package io.github.courage007.design.pattern.structure.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-06-04
 */
class FacadeClientTest {

    @Test
    void test1() {
        FacadeClient client = new FacadeClient();
        client.test();
    }
}