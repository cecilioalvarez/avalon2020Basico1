package es.avalon.clases6composicion;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("razvan");
		
		//Asigno persona al DNI
		DNI d1 = new DNI("X5911123P", "12-12-2022", p1);
		
		//Asigno DNI a la persona
		p1.setDni(d1);
		
		//Print
		System.out.println(p1.getNombre());
		System.out.println(p1.getDni().getNumero());
		System.out.println(p1.getDni().getFechaCaducidad());

	}

}
