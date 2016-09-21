package cl.chokkoazul.src.abstractfactory;

public class ScooterElectricidad extends Scooter {

	public ScooterElectricidad(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter electrico modelo: " + modelo + " de color: " + color + " de potencia " + potencia
				+ " de potencia: " + potencia);
	}

}
