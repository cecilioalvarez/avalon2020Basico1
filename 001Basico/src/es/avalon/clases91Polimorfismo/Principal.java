package es.avalon.clases91Polimorfismo;

public class Principal {

	public static void main(String[] args) {
	
		Persona p= new Persona("gema", 30);
		//le apuntamos con un un puntero de persona
		Persona d= new Deportista("pedro",40,"padel");
		
		p.andar();
		d.andar();
		
		Deportista d1= (Deportista)d;
		System.out.println(d1.getDeporte());
		

	}

}
