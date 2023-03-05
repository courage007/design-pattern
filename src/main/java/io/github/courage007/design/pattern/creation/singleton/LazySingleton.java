package io.github.courage007.design.pattern.creation.singleton;

import java.util.Objects;

/**
 * [懒汉模式]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if(Objects.isNull(instance)) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void foo() {
        System.out.println("---------do some thing in a LazySingleton instance---------");
    }
}
