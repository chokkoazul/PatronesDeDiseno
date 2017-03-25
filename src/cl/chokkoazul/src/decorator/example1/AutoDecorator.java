package cl.chokkoazul.src.decorator.example1;

/**
 * Created by cristian.osorio on 05-03-17.
 */
// Decorator
public abstract class AutoDecorator implements Vendible {
    private Vendible vendible;

    public AutoDecorator(Vendible vendible) {
        this.vendible = vendible;
    }

    public Vendible getVendible() {
        return vendible;
    }

    public void setVendible(Vendible vendible) {
        this.vendible = vendible;
    }
}
