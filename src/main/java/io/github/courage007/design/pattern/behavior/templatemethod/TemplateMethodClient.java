package io.github.courage007.design.pattern.behavior.templatemethod;

/**
 * [模板方法模式客户端]
 *
 * @date: 2023-08-05
 */
public class TemplateMethodClient {
    public void test() {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();
        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}
