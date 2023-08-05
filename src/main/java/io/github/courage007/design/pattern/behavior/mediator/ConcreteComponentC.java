package io.github.courage007.design.pattern.behavior.mediator;

/**
 * [具体组件A]
 *
 * @date: 2023-08-05
 */
public class ConcreteComponentC extends Component {
    public ConcreteComponentC(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void operation(String message) {
        super.operation(message);
        operationC();
    }

    public void operationC() {
        System.out.println("operationC in a Concrete ComponentC instance");
    }
}
