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

    @Override
    public void operation(String message) {
        super.operation(message);
        operationB();
    }

    public void operationB() {
        System.out.println("operationB in a Concrete ComponentB instance");
    }
}
