package io.github.courage007.design.pattern.structure.bridge;

/**
 * [具体实现类A]
 *
 * @date: 2023-05-29
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImp() {
        System.out.println("---------do some thing in a concrete implementor A instance---------");
    }
}
