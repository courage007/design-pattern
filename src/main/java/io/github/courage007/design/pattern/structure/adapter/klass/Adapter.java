package io.github.courage007.design.pattern.structure.adapter.klass;

/**
 * [适配器]
 *
 * @date: 2023-05-23
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specialRequest();
    }
}
