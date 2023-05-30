package io.github.courage007.design.pattern.structure.bridge;

/**
 * [扩充抽象类]
 *
 * @date: 2023-05-29
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        this.implementor.operationImp();
    }
}
