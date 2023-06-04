package io.github.courage007.design.pattern.structure.facade;

/**
 * [外观模式客户端]
 *
 * @date: 2023-06-04
 */
public class FacadeClient {
    public void test() {
        Facade facade = new Facade();
        facade.operationA();
        facade.operationB();
        facade.operationC();
    }
}
