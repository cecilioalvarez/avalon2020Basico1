package Clase7Herencia;


public class Principal {

	public static void main(String[] args) {
		
		Telefono t= new Telefono(123455,"samsung");
		System.out.println(t.getNumero());
		System.out.println(t.getMarca());
		
		t.llamar(856473);
		
		SmartPhone t2= new SmartPhone(656455,"samsung");
		System.out.println(t2.getNumero());
		System.out.println(t2.getMarca());
		
		t2.llamar(8678973);
		
		t2.setWhatapp("wa-pepe");
		t2.llamarVideos("wa-juanito");

	}

}
