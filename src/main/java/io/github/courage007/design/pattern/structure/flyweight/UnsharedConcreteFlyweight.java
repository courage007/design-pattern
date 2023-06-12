package io.github.courage007.design.pattern.structure.flyweight;

/**
 * [不共享享元类]
 *
 * @date: 2023-06-06
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operation(String extrinsic) {
        System.out.println("do some thing in the unshared concrete flyweight instance");
    }
}
