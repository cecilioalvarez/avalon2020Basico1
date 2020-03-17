package es.avalon.clases6composicion2;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona p= new Persona("gema");
		Dni dni= new Dni("1","hoy",p);
		p.setDni(dni);
		
		
		p.getNombre();
		p.getNombre();
		p.getDni().getPersona().getNombre();
		p.getNombre();
		p.getDni().getNumero();
		
		Persona p2= new Persona("cecilio");
		
		Dni dni2= new Dni("1","hoy",p2);
		
		System.out.println(dni2.getNumero());
		// es el objeto dni y accedo al numero
		//dni2.getNumero()
		
		// es el objto dni accedo al objeto persona que tiene
		dni2.getPersona().getNombre();
		
		Persona refPersona=dni2.getPersona();
		System.out.println(refPersona.getNombre());
//		
//		p2.setDni(dni2);
//		
//		Dni[] lista= new Dni[] {p.getDni(),p2.getDni()};
//		
//		
////		System.out.println(dni.getPersona().getNombre());
////		System.out.println(p.getNombre());
////		
//		imprimirNombresDeDni(lista);
	}

	
	
	public static void imprimirNombresDeDni (Dni[] lista) {
		
		// en este trozo no hay forma de acceder directamente
		// a la lista de personas porque no la recibo
		//recibo una lista de dnis
		//claro como los dnis estan relacionados con 
		//las personas puedo acceder a ellas.
		
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i].getPersona().getNombre());
		}
	}
	
}
