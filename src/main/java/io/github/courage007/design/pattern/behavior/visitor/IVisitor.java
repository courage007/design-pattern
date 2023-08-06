package io.github.courage007.design.pattern.behavior.visitor;

/**
 * [访问者接口]
 *
 * @date: 2023-08-04
 */
public interface IVisitor {
    void visitElement(ConcreteElementA element);

    void visitElement(ConcreteElementB element);
}
