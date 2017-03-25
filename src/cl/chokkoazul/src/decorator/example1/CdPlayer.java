package cl.chokkoazul.src.decorator.example1;

/**
 * Created by cristian.osorio on 06-03-17.
 */
// Decorator Concreto
public class CdPlayer extends AutoDecorator {
    public CdPlayer(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Cd Player";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 100000;
    }
}
