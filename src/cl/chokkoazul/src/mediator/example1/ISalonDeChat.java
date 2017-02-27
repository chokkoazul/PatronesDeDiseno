package cl.chokkoazul.src.mediator.example1;

/**
 * Created by cristian.osorio on 26-02-17.
 */
public interface ISalonDeChat {
    public abstract void registra(Usuario participante);
    public abstract void envia(String de, String a, String msg);

}
