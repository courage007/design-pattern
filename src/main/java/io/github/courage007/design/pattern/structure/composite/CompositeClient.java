package io.github.courage007.design.pattern.structure.composite;

/**
 * [组合模式客户端]
 *
 * @date: 2023-06-04
 */
public class CompositeClient {
    public void test() {
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        Composite branch = new Composite("Composite X");
        Leaf leafXa = new Leaf("Leaf XA");
        branch.add(leafXa);
        branch.add(new Leaf("Leaf XB"));
        branch.remove(leafXa);
        root.add(branch);
        Component leafXb = root.getChild("Leaf XB");
        leafXb.operation();
    }
}
