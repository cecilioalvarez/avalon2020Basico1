package es.avalon.clases7Composicion;

public class PrincipalDNI {

	public static void main(String[] args) {
		Persona p = new Persona(" Juan Manuel");
		
		//añadir parametro al constructor
		DNI dni= new DNI("1","hoy",p);
		p.setDni(dni);
		
		Persona p2= new Persona ("Juan Manuel");
		DNI dni2= new DNI("1","hoy",p2);
		p2.setDni(dni2);
			
		DNI[]lista= new DNI [] {p.getDni(),p2.getDni()};
		
		imprimirNombresDeDNI(lista);
		
		
		
	}

	private static void imprimirNombresDeDNI(DNI[] lista) {
		for(int i=0;i<lista.length; i++) {
			System.out.println(lista[i].getPersona().getNombre());
		}
		
	}

}
