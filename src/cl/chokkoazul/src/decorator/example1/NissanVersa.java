package cl.chokkoazul.src.decorator.example1;

/**
 * Created by cristian.osorio on 05-03-17.
 */
public class NissanVersa extends Auto {
    @Override
    public String getDescripcion() {
        return "Nissan Versa año 2016";
    }

    @Override
    public int getPrecio() {
        return 6500000;
    }
}
