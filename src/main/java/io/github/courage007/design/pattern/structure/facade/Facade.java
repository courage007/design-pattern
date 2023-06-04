package io.github.courage007.design.pattern.structure.facade;

import io.github.courage007.design.pattern.structure.decorator.Component;

/**
 * [外观类]
 *
 * @date: 2023-06-04
 */
public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void operationA() {
        systemA.operationA();
    }

    public void operationB() {
        systemB.operationB();
    }

    public void operationC() {
        systemC.operationC();
    }
}
