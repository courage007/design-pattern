package io.github.courage007.design.pattern.behavior.command;

/**
 * [命令模式客户端]
 *
 * @date: 2023-08-04
 */
public class CommandClient {
    public void test() {
        Receiver receiver = new Receiver();
        ICommand commandA = new ConcreteCommandA(receiver);
        Invoker invokerA = new Invoker(commandA);
        invokerA.executeCommand();

        ICommand commandB = new ConcreteCommandB(receiver);
        Invoker invokerB = new Invoker(commandB);
        invokerB.executeCommand();
    }
}
