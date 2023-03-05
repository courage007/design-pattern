package io.github.courage007.design.pattern.creation.singleton;

import java.util.Objects;

/**
 * [双重检查线程安全模式客户端]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class DoubleCheckSingletonClient {
    public void test() {
        DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance();
        singleton.foo();
    }
}
