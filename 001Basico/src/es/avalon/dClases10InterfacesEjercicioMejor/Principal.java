package es.avalon.dClases10InterfacesEjercicioMejor;

public class Principal {

	public static void main(String[] args) {

		ElementoCasa ordenador = new Ordenador();
		System.out.println(ordenador.isEstado());
		ordenador.pulsar();
		System.out.println(ordenador.isEstado());
		ordenador.pulsar();
		System.out.println(ordenador.isEstado());
		System.out.println();
		ElementoCasa caldera = new Caldera();
		System.out.println(caldera.isEstado());
		caldera.pulsar();
		System.out.println(caldera.isEstado());
		

	}

}
