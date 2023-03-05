package io.github.courage007.design.pattern.creation.singleton;

/**
 * [饿汉模式客户端]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class HungrySingletonClient {
    public void test() {
        HungrySingleton singleton = HungrySingleton.getInstance();
        singleton.foo();
    }
}
