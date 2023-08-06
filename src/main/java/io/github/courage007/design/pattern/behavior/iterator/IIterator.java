package io.github.courage007.design.pattern.behavior.iterator;

import io.github.courage007.design.pattern.behavior.visitor.ObjectStructure;

/**
 * [迭代器接口]
 *
 * @date: 2023-08-06
 */
public interface IIterator {
    Object first();

    Object next();

    boolean hasNext();

    Object currentItem();
}
