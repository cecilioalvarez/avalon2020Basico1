package es.avalon.clases10Interfaces3;

public class Principal {

	public static void main(String[] args) {

		ElementoCasa e1 = new Caldera();
		ElementoCasa e2 = new Television();
		ElementoCasa e3 = new Ordenador();

		Casa c = new Casa();
		c.addElemento(e1);
		c.addElemento(e2);
		c.addElemento(e3);
		c.encenderTodo();

		System.out.println("*********************");
		
		//Vemos el estado de los elementos
		for (ElementoCasa elemento : c.getListacasa()) {
			if (elemento.isEncendido()) {
				System.out.println("El elemento esta encendido");
			}
		}
	}
}
