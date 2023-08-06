package io.github.courage007.design.pattern.creation.prototype;

/**
 * [具体原型类]
 *
 * @date: 2023-02-14
 */
public class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype() {

    }

    public String getField() {
        return field;
    }

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        Object object = new Object();
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.field = this.field;
        return concretePrototype;
    }
}
