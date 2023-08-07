package io.github.courage007.design.pattern.behavior.memento;

/**
 * [备忘录]
 *
 * @date: 2023-08-06
 */
public class Memento {
    private String name;

    private String describe;

    private Originator originator;

    public Memento(Originator originator, String name, String describe) {
        this.originator = originator;
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return this.name;
    }

    public String getDescribe() {
        return this.describe;
    }
}
