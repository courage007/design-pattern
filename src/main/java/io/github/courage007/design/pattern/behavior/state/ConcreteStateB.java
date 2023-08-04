package io.github.courage007.design.pattern.behavior.state;

/**
 * [具体状态类B]
 *
 * @date: 2023-08-03
 */
public class ConcreteStateB implements IState {
    private static ConcreteStateB state;

    public static IState getInstance() {
        if (state == null) {
            state = new ConcreteStateB();
        }
        return state;
    }

    @Override
    public void handle(StateContext context) {
        doSomething();
        context.setCurrentState(ConcreteStateA.getInstance());
    }

    @Override
    public void doSomething() {
        System.out.println("do some thing in the concrete B instance");
    }
}
