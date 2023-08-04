package io.github.courage007.design.pattern.behavior.command;

/**
 * [具体命令类A]
 *
 * @date: 2023-08-04
 */
public class ConcreteCommandA implements ICommand {
    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("this is a concrete command A instance");
        receiver.actionA();
    }
}
