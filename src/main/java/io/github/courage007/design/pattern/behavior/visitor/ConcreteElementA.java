package io.github.courage007.design.pattern.behavior.visitor;

/**
 * [具体元素B]
 *
 * @date: 2023-08-04
 */
public class ConcreteElementA implements IElement {
    public void accept(IVisitor visitor) {
        visitor.visitElement(this);
    }
}
