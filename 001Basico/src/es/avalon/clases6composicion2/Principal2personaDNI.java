package es.avalon.clases6composicion2;

public class Principal2personaDNI {

	public static void main(String[] args) {
		
		// creo la persona
		Persona p1=new Persona("Pepe");
		
		DNI d1=new DNI(72081889,"marzo",p1);
				
		//porque esto asigna el DNI a la persona
		p1.setDni(d1);
				
		//Imprimo el nombre
		System.out.println(p1.getNombre());
				
		//Aqui accedo a la propiedad de historal de enfermedad
		//Accedo a la relacion
		//Imprimo el numero
		System.out.println(p1.getDni().getNumero());
		//Imprimo la fecha de caducidad
		System.out.println(p1.getDni().getFechacaducidad());
	}

}
