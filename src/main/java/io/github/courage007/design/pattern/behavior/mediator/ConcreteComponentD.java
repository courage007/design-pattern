package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [具体组件A]
 *
 * @date: 2023-08-05
 */
public class ConcreteComponentD extends Component {
    public ConcreteComponentD(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void operation(String message) {
        super.operation(message);
        operationD();
    }

    public void operationD() {
        System.out.println("operationD in a Concrete ComponentD instance");
    }
}
