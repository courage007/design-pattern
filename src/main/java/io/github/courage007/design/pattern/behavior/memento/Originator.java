package io.github.courage007.design.pattern.behavior.memento;

/**
 * [原发器]
 *
 * @date: 2023-08-06
 */
public class Originator {
    private String name;

    private String describe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return this.describe;
    }

    public Memento save() {
        return new Memento(this, name, describe);
    }

    public void restore(Memento memento) {
        setName(memento.getName());
        setDescribe(memento.getDescribe());
    }
}
