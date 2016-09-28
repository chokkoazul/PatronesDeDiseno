package cl.chokkoazul.src.abstractfactory;

public class ScooterGasolina extends Scooter {
	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter gasolina modelo: " + modelo + " de color: " + color + " de potencia: " + potencia
	);
	}

}
