package cl.chokkoazul.src.abstractfactory;

public class FabricaVehiculoGasolina implements FabricaVehiculo{

		@Override
		public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
			// TODO Auto-generated method stub
			return new AutomovilGasolina(modelo,color,potencia,espacio);
		}

		@Override
		public Scooter creaScooter(String modelo, String color, int potencia) {
			// TODO Auto-generated method stub
			return new ScooterGasolina(modelo,color,potencia);
		}

	}
