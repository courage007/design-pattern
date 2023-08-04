package io.github.courage007.design.pattern.behavior.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-08-04
 */
class CommandClientTest {

    @Test
    void test1() {
        CommandClient commandClient = new CommandClient();
        commandClient.test();
    }
}