package cl.chokkoazul.src.mediator.example2;

/**
 * Created by cristian.osorio on 26-02-17.
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);

    }

    @Override
    public void messageReceived(String message) {
        System.out.println("colleage2 got message " + message);

    }

}