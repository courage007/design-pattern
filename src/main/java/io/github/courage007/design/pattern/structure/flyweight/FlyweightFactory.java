package io.github.courage007.design.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * [享元工厂]
 *
 * @date: 2023-06-06
 */
public class FlyweightFactory {
    private static final Map<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = pool.get(extrinsic);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic, flyweight);
            System.out.println("put a fly weight instance to the pool");
        }
        return flyweight;
    }
}
