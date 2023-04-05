package io.github.courage007.design.pattern.creation.builder;

/**
 * [建造者实现类]
 *
 * @date: 2023-04-05
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
