package io.github.courage007.design.pattern.creation.builder;

/**
 * [指挥者]
 *
 * @date: 2023-04-05
 */
public class Director {
    public Director(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
