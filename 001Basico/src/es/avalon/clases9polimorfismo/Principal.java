package es.avalon.clases9polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p= new Persona(30,"Gema");
		// le apuntamos con un puntero de persona, no tenemos opcion de getDeporte
		Persona d=new Deportista(40,"Pedro","padel");
		
		p.andar();
		d.andar();
		
		// le damos la opcion de deporte
		Deportista d1=(Deportista)d;
		System.out.println(d1.getDeporte());
	}

}
