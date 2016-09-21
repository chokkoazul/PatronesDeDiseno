package cl.chokkoazul.src.abstractfactory;

public class AutomovilElectricidad extends Automovil{

	public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Automovil electrico modelo: " + modelo + " de color: " + color + " de potencia " + potencia
				+ " de espacio: " + espacio);
	}
	
}
