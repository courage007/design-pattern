package io.github.courage007.design.pattern.behavior.memento;

import java.util.LinkedList;

/**
 * [负责人]
 *
 * @date: 2023-08-06
 */
public class Caretaker {
    private Originator originator;

    private LinkedList<Memento> history;

    public Caretaker(Originator originator) {
        this.originator = originator;
        history = new LinkedList<>();
    }

    public void snapshot() {
        history.push(originator.save());
    }

    public void undo() {
        Memento lastMemento = history.pop();
        originator.restore(lastMemento);
    }
}
