package io.github.courage007.design.pattern.behavior.state;

/**
 * [抽象状态类]
 *
 * @date: 2023-08-03
 */
public interface IState {
    void handle(StateContext context);

    void doSomething();
}
