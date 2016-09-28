package cl.chokkoazul.src.builder;

// clase principal
public class Principal {

	
	public static void main(String[] args){
		Cocina cocina = new Cocina(); // director
		PizzaBuilder hawa = new HawaiPizzaBuilder();
		PizzaBuilder pica = new PicantePizzaBuilder();
		
		cocina.setPizzaBuilder(hawa);
		cocina.construirPizza();
		
		Pizza pizza = cocina.getPizza();
		
		System.out.println(pizza);
		
	}
}
