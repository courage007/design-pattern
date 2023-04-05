package io.github.courage007.design.pattern.creation.builder;

/**
 * [建造者基类]
 *
 * @date: 2023-02-14
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract Product getProduct();
}
