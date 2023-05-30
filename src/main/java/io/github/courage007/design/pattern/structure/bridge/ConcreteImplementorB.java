package io.github.courage007.design.pattern.structure.bridge;

/**
 * [具体实现类B]
 *
 * @date: 2023-05-29
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImp() {
        System.out.println("---------do some thing in a concrete implementor B instance---------");
    }
}
