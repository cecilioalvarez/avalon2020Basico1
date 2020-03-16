package es.avalon.clases6composicion2;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("razvan");
		
		//Asigno persona al DNI
		DNI d1 = new DNI("X0000123P", "12-12-2022", p1);
		
		//Asigno DNI a la persona
		p1.setDni(d1);
		
		//Print
		System.out.println(p1.getNombre());
		
		//Extraigo los datos del DNI de la persona
		System.out.println(p1.getDni().getNumero());
		System.out.println(p1.getDni().getFechaCaducidad());
		
		//Extraigo el nombre de la persona de su DNI
		System.out.println(d1.getPersona().getNombre());

	}

}
