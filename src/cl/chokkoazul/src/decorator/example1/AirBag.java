package cl.chokkoazul.src.decorator.example1;

/**
 * Created by cristian.osorio on 06-03-17.
 */
// Decorator Concreto
public class AirBag extends AutoDecorator {
    public AirBag(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + AirBag";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 2000000;
    }
}
