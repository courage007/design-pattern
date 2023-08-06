package io.github.courage007.design.pattern.behavior.iterator;

import io.github.courage007.design.pattern.behavior.visitor.ConcreteElementA;

/**
 * [聚合接口]
 *
 * @date: 2023-08-06
 */
public interface IAggregate {
    IIterator createIterator();

    void append(Object element);

    void removeLast();
}
