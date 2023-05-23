package io.github.courage007.design.pattern.structure.proxy;

/**
 * [真实对象]
 *
 * @date: 2023-04-08
 */
public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("---------do some thing in a real subject instance---------");
    }
}
