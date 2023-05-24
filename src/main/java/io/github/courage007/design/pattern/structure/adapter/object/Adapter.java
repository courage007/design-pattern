package io.github.courage007.design.pattern.structure.adapter.object;

/**
 * [适配器]
 *
 * @date: 2023-05-23
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
