package io.github.courage007.design.pattern.behavior.interpreter;

/**
 * [解释器模式客户端]
 *
 * @date: 2023-08-07
 */
public class InterpreterClient {
    public void test() {
        String input = "2 1 5 + *";
        System.out.println("input is: " + input);
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(input);
        System.out.println("result: " + result);
    }
}
