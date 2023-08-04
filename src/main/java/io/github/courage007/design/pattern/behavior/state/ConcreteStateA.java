package io.github.courage007.design.pattern.behavior.state;

/**
 * [具体状态类A]
 *
 * @date: 2023-08-03
 */
public class ConcreteStateA implements IState {
    private static ConcreteStateA state;

    public static IState getInstance() {
        if (state == null) {
            state = new ConcreteStateA();
        }
        return state;
    }

    @Override
    public void handle(StateContext context) {
        doSomething();
        context.setCurrentState(ConcreteStateB.getInstance());
    }

    @Override
    public void doSomething() {
        System.out.println("do some thing in the concrete A instance");
    }
}
