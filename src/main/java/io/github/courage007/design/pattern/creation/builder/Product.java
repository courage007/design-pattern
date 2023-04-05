package io.github.courage007.design.pattern.creation.builder;

/**
 * [产品基类]
 *
 * @date: 2023-04-05
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void function() {
        System.out.printf("partA %s, partB %s, partC %s", partA, partB, partC);
    }
}
