package io.github.courage007.design.pattern.creation.singleton;

import java.util.Objects;

/**
 * [双重检查线程安全模式]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DoubleCheckSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public void foo() {
        System.out.println("---------do some thing in a DoubleCheckSingleton instance---------");
    }
}
