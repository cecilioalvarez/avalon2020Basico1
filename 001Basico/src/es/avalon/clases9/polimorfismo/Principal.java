package es.avalon.clases9.polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Persona p= new Persona("gema", 30);
		Deportista d= new Deportista("pedro",40);
		
		p.andar();
		d.andar();

	}

}
