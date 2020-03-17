package es.avalon.clases8.herencia;

public class Principal2 {
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Pedro", 30);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		
		Deportista p2 = new Deportista("ana", 25, "futbol");
		
		System.out.println(p2.getNombre());
		System.out.println(p2.getEdad());
		System.out.println(p2.getDeporte());
		
	}
	

	

}
