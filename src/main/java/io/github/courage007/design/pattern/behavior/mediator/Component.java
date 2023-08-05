package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [组件]
 *
 * @date: 2023-08-05
 */
public abstract class Component {
    protected IMediator mediator;

    public Component(IMediator mediator) {
        this.mediator = mediator;
    }

    public void operation(String message) {
        System.out.println("message is " + message);
    }

    public void send(String message, Component target) {
        Sender sender = new Sender(message, this, target);
        mediator.notify(sender);
    }
}
