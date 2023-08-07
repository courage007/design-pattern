package io.github.courage007.design.pattern.behavior.interpreter;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-08-07
 */
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
