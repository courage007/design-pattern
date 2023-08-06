package io.github.courage007.design.pattern.behavior.command;

/**
 * [具体命令类B]
 *
 * @date: 2023-08-04
 */
public class ConcreteCommandB implements ICommand {
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("this is a concrete command B instance");
        receiver.actionB();
    }
}
