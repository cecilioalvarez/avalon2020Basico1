package es.avalon.interfaces3;

public class Principal {

	public static void main(String[] args) {
		
		ElementoCasa e1 = new Ordenador();
		ElementoCasa e2 = new Television();
		ElementoCasa e3 = new Caldera();
		
//		System.out.println(e1.isEncendido());
//		e1.pulsar();
//		System.out.println(e1.isEncendido());
		
		Casa c1 = new Casa();
		c1.addElemento(e1);
		c1.addElemento(e2);
		c1.addElemento(e3);
		
		c1.encenderTodo();

		
		System.out.println("***********");
		//Hacerlo bonito
		for (ElementoCasa elemento: c1.getListaElementos()) {
			
			if (elemento.isEncendido()) {
				System.out.println("El elemento " + elemento.getClass() + " está encendido: " + elemento.isEncendido());
			}
			
			
		}
		
		

	}

}
