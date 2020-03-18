package es.avalon.interfaces3;

public class Principal {

	public static void main(String[] args) {
		
		
		ElementoCasa e1= new Caldera();
		ElementoCasa e2= new Frigorifico();
		
		Casa c= new Casa();
		c.addElemento(e1);
		c.addElemento(e2);
		c.encenderTodo();
		
		System.out.println("********************");
		for (ElementoCasa elemento:c.getElementos() ) {
			
			
			if (elemento.isEncender()) {
				
				System.out.println("el elemento esta encendido");
			}
		}

	}

}
