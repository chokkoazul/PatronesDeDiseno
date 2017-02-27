package cl.chokkoazul.src.mediator.example2;

/**
 * Created by cristian.osorio on 26-02-17.
 */
public abstract class Colleague
{
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);

}