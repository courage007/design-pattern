package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [具体中介者接口]
 *
 * @author: courage007
 * @date: 2023-08-05
 */
public class ConcreteMediator implements IMediator {
    @Override
    public void notify(Sender sender) {
        String message = sender.getMessage();
        Component target = sender.getTarget();
        target.operation(message);
    }
}
