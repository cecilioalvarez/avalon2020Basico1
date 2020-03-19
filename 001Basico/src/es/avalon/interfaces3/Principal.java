package es.avalon.interfaces3;

public class Principal {
	
	public static void main(String[] args) {

		ElementoCasa e1=new Caldera();
		ElementoCasa e2=new Ordenador();
		ElementoCasa e3=new Frigorifico();
	
		Casa c=new Casa();
		
		c.addElementos(e1);
		c.addElementos(e2);
		c.addElementos(e3);
		c.encenderTodo();
		
		System.out.println("************************");
		
		// vemos el estado de los elementos
		for (ElementoCasa elemento:c.getMiselementos()) {
			
			if (elemento.isEncendido()) {
				
				System.out.println("el elemento esta encendido");
			}
		}
	}
}
