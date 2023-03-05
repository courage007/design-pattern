package io.github.courage007.design.pattern.creation.singleton;

/**
 * [饿汉模式]
 *
 * @author: courage007
 * @date: 2023-02-26
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void foo() {
        System.out.println("---------do some thing in a HungrySingleton instance---------");
    }
}
