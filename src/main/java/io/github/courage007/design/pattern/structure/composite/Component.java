package io.github.courage007.design.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * [组合对象]
 *
 * @date: 2023-06-04
 */
public abstract class Component {
    private String name;

    protected List<Component> children = new ArrayList<>();

    public Component(String componentName) {
        this.name = componentName;
    }

    public void operation() {
        System.out.println(this.name);
    }

    public Component getChild(String componentName) {
        for (Component current : children) {
            if (current.name.equals(componentName)) {
                return current;
            }
            Component childComponent = current.getChild(componentName);
            if (childComponent != null) {
                return childComponent;
            }
        }
        return null;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);
}
