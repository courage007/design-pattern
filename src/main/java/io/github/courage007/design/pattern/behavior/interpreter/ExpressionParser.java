package io.github.courage007.design.pattern.behavior.interpreter;

import java.util.LinkedList;
import java.util.Stack;

/**
 * [描述]
 *
 * @author: courage007
 * @date: 2023-08-07
 */
public class ExpressionParser {
    private static final String ADD = "+";

    private static final String SUBTRACT = "-";

    private static final String MULTIPLY = "*";

    private static final String SPLITTER = " ";

    private LinkedList<Expression> stack = new LinkedList();

    public int parse(String str) {
        String[] tokenList = str.split(SPLITTER);
        for (String symbol : tokenList) {
            if (!isOperator(symbol)) {
                Expression numberExpression = new NumberExpression(symbol);
                stack.push(numberExpression);
            } else {
                Expression firstExpression = stack.pop();
                Expression secondExpression = stack.pop();
                Expression operator = getExpressionObject(firstExpression, secondExpression, symbol);
                if (operator == null) {
                    throw new RuntimeException("unknown symbol: " + symbol);
                }
                int result = operator.interpret();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
            }
        }
        return stack.pop().interpret();
    }

    private boolean isOperator(String symbol) {
        return symbol.equals(ADD) || symbol.equals(SUBTRACT) || symbol.equals(MULTIPLY);

    }

    private Expression getExpressionObject(Expression firstExpression, Expression secondExpression, String symbol) {
        switch (symbol) {
            case ADD:
                return new AdditionExpression(firstExpression, secondExpression);
            case SUBTRACT:
                return new SubtractionExpression(firstExpression, secondExpression);
            case MULTIPLY:
                return new MultiplicationExpression(firstExpression, secondExpression);
            default:
                return null;
        }
    }
}