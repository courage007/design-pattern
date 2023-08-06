package io.github.courage007.design.pattern.behavior.iterator;

/**
 * [具体聚合类]
 *
 * @date: 2023-08-06
 */
public class ConcreteAggregate implements IAggregate {
    private String[] elements;

    private int cursor = -1;

    public ConcreteAggregate(int size) {
        elements = new String[size];
    }

    @Override
    public void append(Object element) {
        cursor++;
        elements[cursor] = (String) element;
    }

    @Override
    public void removeLast() {
        elements[cursor] = "";
        cursor--;
    }

    public int getCursor() {
        return this.cursor;
    }

    public String[] getElements() {
        return this.elements;
    }

    @Override
    public IIterator createIterator() {
        return new ConcreteIterator(this);
    }
}
