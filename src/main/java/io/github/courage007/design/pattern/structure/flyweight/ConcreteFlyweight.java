package io.github.courage007.design.pattern.structure.flyweight;

import io.github.courage007.design.pattern.creation.simplefactory.ConcreteProductA;

/**
 * [具体享元类]
 *
 * @date: 2023-06-06
 */
public class ConcreteFlyweight extends Flyweight {
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operation(String extrinsic) {
        System.out.println("do some thing in the concrete flyweight instance");
    }
}
