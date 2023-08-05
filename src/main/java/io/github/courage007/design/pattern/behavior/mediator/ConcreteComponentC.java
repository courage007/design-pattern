package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [具体组件A]
 *
 * @date: 2023-08-05
 */
public class ConcreteComponentB extends Component {
    public ConcreteComponentB(IMediator mediator) {
        super(mediator);
    }

    public void operation(String message, Component target) {
        super.operation(message, target);
        operationA();
    }

    public void operationA() {
        System.out.println("operationA in a Concrete ComponentA instance");
    }
}
