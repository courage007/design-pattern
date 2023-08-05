package io.github.courage007.design.pattern.behavior.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-08-05
 */
class TemplateMethodClientTest {

    @Test
    void test1() {
        TemplateMethodClient client = new TemplateMethodClient();
        client.test();
    }
}