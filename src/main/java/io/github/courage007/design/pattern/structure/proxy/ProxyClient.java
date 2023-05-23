package io.github.courage007.design.pattern.structure.proxy;

/**
 * [代理模式客户端]
 *
 * @date: 2023-04-08
 */
public class ProxyClient {
    public void test(){
        Subject subjectProxy = new Proxy();
        subjectProxy.operation();
    }
}
