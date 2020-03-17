package es.avalon.clases8.herencia;

public class Principal {
	
	public static void main(String[] args) {
		
		Telefono t = new Telefono(123456789, "Samsung");
		
		System.out.println(t.getNumero());
		System.out.println(t.getMarca());
		
		t.llamar(987654321);
		
		Smartphone t2 = new Smartphone(5555555, "apple");
		
		System.out.println(t2.getNumero());
		System.out.println(t2.getMarca());
		t2.llamar(777777777);
		
		t2.setWhatapp("wa-pedro");
		t2.llamarVideo("wa-juan");
		
		
		
	}

}
