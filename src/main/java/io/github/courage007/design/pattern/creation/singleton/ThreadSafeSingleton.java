package io.github.courage007.design.pattern.creation.singleton;

import java.util.Objects;

/**
 * [线程安全模式]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static ThreadSafeSingleton getInstance() {
        synchronized (ThreadSafeSingleton.class) {
            if (Objects.isNull(instance)) {
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    }

    public void foo() {
        System.out.println("---------do some thing in a ThreadSafeSingleton instance---------");
    }
}
