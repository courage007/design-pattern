package io.github.courage007.design.pattern.structure.bridge;

/**
 * [抽象类]
 *
 * @date: 2023-05-29
 */
public class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImp();
    }
}
