package io.github.courage007.design.pattern.behavior.interpreter;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-08-07
 */
public class SubtractionExpression implements Expression {
    private Expression firstExpression, secondExpression;

    public SubtractionExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return Math.subtractExact(this.firstExpression.interpret(), this.secondExpression.interpret());
    }

    @Override
    public String toString() {
        return "-";
    }
}
