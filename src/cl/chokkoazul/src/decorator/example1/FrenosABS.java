package cl.chokkoazul.src.decorator.example1;

/**
 * Created by cristian.osorio on 06-03-17.
 */
// Decorator Concreto
public class FrenosABS extends AutoDecorator {
    public FrenosABS(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + FrenosABS";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 2500000;
    }
}
