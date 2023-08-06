package io.github.courage007.design.pattern.creation.singleton;

/**
 * [惰性加载模式]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class LazyLoadingSingleton {
    private LazyLoadingSingleton() {

    }

    public static LazyLoadingSingleton getInstance() {
        return Holder.instance;
    }

    public void foo() {
        System.out.println("---------do some thing in a LazyLoadingSingleton instance---------");
    }

    private static class Holder {
        private static LazyLoadingSingleton instance = new LazyLoadingSingleton();
    }
}
