package io.github.courage007.design.pattern.behavior.visitor;

/**
 * [具体观察者类A]
 *
 * @date: 2023-08-04
 */
public class ConcreteVisitorA implements IVisitor {
    @Override
    public void visitElement(ConcreteElementA element) {
        System.out.println("handle a ConcreteElementA instance in ConcreteVisitorA");
    }

    @Override
    public  void visitElement(ConcreteElementB element) {
        System.out.println("handle a ConcreteElementB instance in ConcreteVisitorA");
    }
}
