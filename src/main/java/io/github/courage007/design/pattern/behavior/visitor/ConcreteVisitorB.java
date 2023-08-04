package io.github.courage007.design.pattern.behavior.visitor;

/**
 * [具体观察者类B]
 *
 * @date: 2023-08-04
 */
public class ConcreteVisitorB implements IVisitor {
    @Override
    public void visitElement(ConcreteElementA element) {
        System.out.println("handle a ConcreteElementA instance in ConcreteVisitorB");
    }

    @Override
    public  void visitElement(ConcreteElementB element) {
        System.out.println("handle a ConcreteElementB instance in ConcreteVisitorB");
    }
}
