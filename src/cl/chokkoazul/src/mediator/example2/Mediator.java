package cl.chokkoazul.src.mediator.example2;

/**
 * Created by cristian.osorio on 26-02-17.
 */
public interface Mediator
{
    public void send(String message, Colleague colleage);
}