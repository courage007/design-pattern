package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [发送者实体]
 *
 * @author: courage007
 * @date: 2023-08-05
 */
public class Sender {
    private String message;

    private Component source;

    private Component target;

    public Sender(String message, Component source, Component target) {
        this.message = message;
        this.source = source;
        this.target = target;
    }

    public String getMessage() {
        return this.message;
    }

    public Component getSource() {
        return this.source;
    }

    public Component getTarget() {
        return this.target;
    }
}
