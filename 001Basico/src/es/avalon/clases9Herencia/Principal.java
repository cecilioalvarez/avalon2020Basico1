package es.avalon.clases9Herencia;

public class Principal {

	public static void main(String[] args) {

		Telefono t= new Telefono(123345678,"Samsung");
		System.out.println(t.getNumero());
		System.out.println(t.getMarca());
		
		t.llamar(9876245);
		
		SmartPhone t2= new SmartPhone (55555555,"apple");
		
		System.out.println(t2.getNumero());
		System.out.println(t2.getMarca());
		t2.llamar(77777777);
		t2.llamar(44444444);
	}

}
