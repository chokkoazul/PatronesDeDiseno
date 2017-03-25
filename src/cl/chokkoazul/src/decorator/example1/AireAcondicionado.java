package cl.chokkoazul.src.decorator.example1;

/**
 * Created by cristian.osorio on 05-03-17.
 */
// Decorator Concreto
public class AireAcondicionado extends AutoDecorator {

    public AireAcondicionado(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Aire Acondicionado";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 800000;
    }
}
