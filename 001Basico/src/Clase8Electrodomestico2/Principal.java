package Clase8Electrodomestico2;

public class Principal {

	public static void main(String[] args) {
		Electrodomesticos e1 =new Caldera();
		Electrodomesticos e2 =new Television();
		e1.pulsar();
		Casa c=new Casa();
		
		c.addElemento(e1);
		c.addElemento(e2);
		c.encenderTodo();
		
		
		for (Electrodomesticos i:c.getLista()) {
			if(i.isEncender()) {
				System.out.println("el elemento esta encendido");
			}
		}
	
	}

}
