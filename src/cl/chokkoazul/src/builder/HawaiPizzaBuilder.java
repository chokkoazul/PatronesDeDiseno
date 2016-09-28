package cl.chokkoazul.src.builder;

// concrete builder
public class HawaiPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildMasa() {
		pizza.setMasa("suave");

	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("dulce");
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("chorrizo+alcachofas");
	}

}
