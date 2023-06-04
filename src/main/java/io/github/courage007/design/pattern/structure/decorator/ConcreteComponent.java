package io.github.courage007.design.pattern.structure.decorator;

/**
 * [叶节点]
 *
 * @date: 2023-06-04
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("do some thing in the concrete component instance");
    }
}
