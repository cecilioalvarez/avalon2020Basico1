package es.avalon.clases9.herencia2;

public class Principal {

	public static void main(String[] args) {
	
		//constructor con tres parametros
		//la clase deportista hereda de persona
		Deportista d= new Deportista("juan",30,"tenis");
		System.out.println(d.getNombre());
		System.out.println(d.getEdad());
		System.out.println(d.getDeporte());
		

	}

}
