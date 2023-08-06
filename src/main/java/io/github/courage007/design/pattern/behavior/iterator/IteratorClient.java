package io.github.courage007.design.pattern.behavior.iterator;

import io.github.courage007.design.pattern.behavior.visitor.ConcreteElementA;

/**
 * [迭代器模式客户端]
 *
 * @date: 2023-08-06
 */
public class IteratorClient {
    public void test() {
        IAggregate aggregate = new ConcreteAggregate(10);
        aggregate.append("hello");
        aggregate.append("world");
        aggregate.append("foo");
        aggregate.removeLast();
        IIterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
