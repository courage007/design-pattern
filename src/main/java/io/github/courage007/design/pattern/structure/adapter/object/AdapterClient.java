package io.github.courage007.design.pattern.structure.adapter.object;

/**
 * [适配器模式客户端]
 *
 * @date: 2023-05-23
 */
public class AdapterClient {
    public void test() {
        Target adapter = new Adapter();
        adapter.request();
    }
}
