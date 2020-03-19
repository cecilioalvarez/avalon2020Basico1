package es.avalon.InterfacesEjercicio;

public class Principal {

	public static void main(String[] args) {

		ElementoCasa ordenador = new Ordenador();
		System.out.println(ordenador.isEstado());
		ordenador.encender();
		System.out.println(ordenador.isEstado());
		ordenador.apagar();
		System.out.println(ordenador.isEstado());
		
		Ordenador otro = (Ordenador)ordenador;
		System.out.println(otro.isEstado());

	}

}
