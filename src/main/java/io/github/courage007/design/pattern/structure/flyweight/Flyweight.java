package io.github.courage007.design.pattern.structure.flyweight;

/**
 * [抽象享元类]
 *
 * @date: 2023-06-06
 */
public abstract class Flyweight {
    private String intrinsic;
    protected String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operation(String extrinsic);
}
