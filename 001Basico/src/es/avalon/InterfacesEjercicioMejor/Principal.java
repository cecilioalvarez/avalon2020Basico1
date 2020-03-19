package es.avalon.InterfacesEjercicioMejor;

public class Principal {

	public static void main(String[] args) {

		ElementoCasa ordenador = new Ordenador("PC1");
		ElementoCasa television = new Television("Tele1");
		ElementoCasa caldera = new Caldera("Caldera");
		
		Casa casa = new Casa();
		casa.add(ordenador);
		casa.add(television);
		casa.add(caldera);
		
	    System.out.println(ordenador.getNombre());
	    casa.mostrarEstado(ordenador);
		casa.encenderTodo();
		casa.mostrarEstado(ordenador);
		
	}

}
