package io.github.courage007.design.pattern.creation.singleton;

/**
 * [惰性加载模式]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class LazyLoadingSingletonClient {
    public void test() {
        LazyLoadingSingleton singleton = LazyLoadingSingleton.getInstance();
        singleton.foo();
    }
}
