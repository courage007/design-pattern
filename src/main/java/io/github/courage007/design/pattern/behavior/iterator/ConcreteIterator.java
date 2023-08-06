package io.github.courage007.design.pattern.behavior.iterator;

/**
 * [具体迭代器]
 *
 * @date: 2023-08-06
 */
public class ConcreteIterator implements IIterator {
    private ConcreteAggregate aggregate;

    private int index;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public Object first() {
        String[] elements = aggregate.getElements();
        return elements[0];
    }

    @Override
    public Object next() {
        int cursor = aggregate.getCursor();
        if (cursor < 0 || index > cursor) {
            return null;
        }
        String[] elements = aggregate.getElements();
        return elements[index++];
    }

    @Override
    public boolean hasNext() {
        int cursor = aggregate.getCursor();
        if (cursor < 0 || index > cursor) {
            return false;
        }
        return true;
    }

    @Override
    public Object currentItem() {
        int cursor = aggregate.getCursor();
        if (cursor < 0 || index > cursor) {
            return null;
        }
        String[] elements = aggregate.getElements();
        return elements[index];
    }
}
