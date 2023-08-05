package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [具体组件A]
 *
 * @date: 2023-08-05
 */
public class ConcreteComponentA extends Component {
    public ConcreteComponentA(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void operation(String message) {
        super.operation(message);
        operationA();
    }

    public void operationA() {
        System.out.println("operationA in a Concrete ComponentA instance");
    }
}
