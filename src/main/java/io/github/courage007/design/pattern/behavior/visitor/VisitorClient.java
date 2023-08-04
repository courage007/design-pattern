package io.github.courage007.design.pattern.behavior.visitor;

/**
 * [命令模式客户端]
 *
 * @date: 2023-08-04
 */
public class VisitorClient {
    public void test() {
        IElement elementA = new ConcreteElementA();
        IElement elementB = new ConcreteElementB();
        ObjectStructure objectStructure = new ObjectStructure(elementA, elementB);

        IVisitor visitorA = new ConcreteVisitorA();
        visitorA.visitElement((ConcreteElementA) objectStructure.getElementA());
        visitorA.visitElement((ConcreteElementB) objectStructure.getElementB());

        IVisitor visitorB = new ConcreteVisitorB();
        visitorB.visitElement((ConcreteElementA) objectStructure.getElementA());
        visitorB.visitElement((ConcreteElementB) objectStructure.getElementB());
    }
}
