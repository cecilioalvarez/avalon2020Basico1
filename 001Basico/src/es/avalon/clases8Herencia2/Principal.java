package es.avalon.clases8Herencia2;

public class Principal {

	public static void main(String[] args) {

		//Constructor con 3 parametros
		//La clase deportista hereda de persona
		Deportista d=new Deportista("Pepe",25,"Futbol");
		System.out.println(d.getNombre());
		System.out.println(d.getEdad());
		System.out.println(d.getDeporte());

	}

}
