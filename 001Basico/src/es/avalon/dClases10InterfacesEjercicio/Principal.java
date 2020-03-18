package es.avalon.dClases10InterfacesEjercicio;

public class Principal {

	public static void main(String[] args) {

		ElementoCasa ordenador = new Ordenador();
		System.out.println(ordenador.isEstado());
		ordenador.encender();
		ordenador.apagar();

	}

}
