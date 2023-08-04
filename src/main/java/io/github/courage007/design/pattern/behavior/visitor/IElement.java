package io.github.courage007.design.pattern.behavior.visitor;

/**
 * [元素接口]
 *
 * @date: 2023-08-04
 */
public interface IElement {
    void accept(IVisitor visitor);
}
