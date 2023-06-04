package io.github.courage007.design.pattern.structure.composite;

/**
 * [组合节点]
 *
 * @date: 2023-06-04
 */
public class Composite extends Component {
    public Composite(String componentName) {
        super(componentName);
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }
}
