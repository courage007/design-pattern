package io.github.courage007.design.pattern.creation.builder;

/**
 * [建造器客户端]
 *
 * @date: 2023-04-05
 */
public class BuilderClient {
    public void test() {
        Builder builder = new ConcreteBuilder();
        new Director(builder);
        Product product = builder.getProduct();
        product.function();
    }
}
