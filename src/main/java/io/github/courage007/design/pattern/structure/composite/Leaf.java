package io.github.courage007.design.pattern.structure.composite;

/**
 * [叶节点]
 *
 * @date: 2023-06-04
 */
public class Leaf extends Component {
    public Leaf(String componentName) {
        super(componentName);
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("叶节点不能添加子节点");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("叶节点不包含子节点，无法移除子节点");
    }
}
