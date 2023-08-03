package io.github.courage007.design.pattern.behavior.responsibility;

/**
 * [处理器]
 *
 * @date: 2023-08-03
 */
public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void doNext() {
        if (nextHandler != null) {
            nextHandler.handleRequest();
        }
    }

    public abstract void handleRequest();
}
