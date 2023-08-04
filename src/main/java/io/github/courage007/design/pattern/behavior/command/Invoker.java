package io.github.courage007.design.pattern.behavior.command;

/**
 * [调用者]
 *
 * @date: 2023-08-04
 */
public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }
}
