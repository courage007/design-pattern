package io.github.courage007.design.pattern.creation.singleton;

import java.util.Objects;

/**
 * [懒汉模式客户端]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class LazySingletonClient {
    public void test() {
        LazySingleton instance = LazySingleton.getInstance();
        instance.foo();
    }
}
