package io.github.courage007.design.pattern.structure.proxy;

/**
 * [代理类]
 *
 * @date: 2023-04-08
 */
public class Proxy implements Subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void operation() {
        preOperation();
        realSubject.operation();
        afterOperation();
    }

    public void preOperation() {
        System.out.println("pre operation in the proxy");
    }

    public void afterOperation() {
        System.out.println("after operation in the proxy");
    }
}
