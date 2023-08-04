package io.github.courage007.design.pattern.behavior.state;

/**
 * [状态模式客户端]
 *
 * @date: 2023-08-03
 */
public class StateClient {
    public void test() {
        StateContext stateContext = new StateContext(new ConcreteStateA());
        stateContext.request();
        stateContext.request();
        stateContext.request();
    }
}
