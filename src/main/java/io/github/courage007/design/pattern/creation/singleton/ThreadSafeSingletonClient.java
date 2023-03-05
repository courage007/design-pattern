package io.github.courage007.design.pattern.creation.singleton;

import java.util.Objects;

/**
 * [线程安全模式客户端]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class ThreadSafeSingletonClient {
    public void test() {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        singleton.foo();
    }
}
