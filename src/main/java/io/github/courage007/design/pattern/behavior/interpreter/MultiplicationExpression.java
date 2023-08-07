package io.github.courage007.design.pattern.behavior.interpreter;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-08-07
 */
public class MultiplicationExpression implements Expression {
    private Expression firstExpression, secondExpression;

    public MultiplicationExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return Math.multiplyExact(this.firstExpression.interpret(), this.secondExpression.interpret());
    }

    @Override
    public String toString() {
        return "*";
    }
}