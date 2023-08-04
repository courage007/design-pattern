package io.github.courage007.design.pattern.behavior.visitor;

/**
 * [对象结构类]
 *
 * @date: 2023-08-04
 */
public class ObjectStructure {
    private IElement elementA;

    private IElement elementB;

    public ObjectStructure(IElement elementA, IElement elementB) {
        this.elementA = elementA;
        this.elementB = elementB;
    }

    public IElement getElementA() {
        return this.elementA;
    }

    public IElement getElementB() {
        return this.elementB;
    }
}
