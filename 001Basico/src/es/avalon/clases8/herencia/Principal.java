package es.avalon.clases8.herencia;

public class Principal {

	public static void main(String[] args) {
		
		Telefono t= new Telefono(123456789,"samsung");
		
		System.out.println(t.getNumero());
		System.out.println(t.getMarca());
		
		t.llamar(987654321);
		
		SmartPhone t2= new SmartPhone(55555555, "apple");
		
		System.out.println(t2.getNumero());
		System.out.println(t2.getMarca());
		t2.llamar(77777777);
		t2.llamar(44444444);
		
		
		t2.setWhatapp("wa-pepito");
		t2.llamarVideo("wa-juanito");

		
	}

}
