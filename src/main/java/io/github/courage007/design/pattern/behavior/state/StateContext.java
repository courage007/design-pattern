package io.github.courage007.design.pattern.behavior.state;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * [状态上下文]
 *
 * @date: 2023-08-03
 */
public class StateContext {
    private IState currentState;

    public StateContext(IState defaultState) {
        this.currentState = defaultState;
    }

    public IState getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(IState newState) {
        this.currentState = newState;
    }

    public void request() {
        currentState.handle(this);
    }
}
