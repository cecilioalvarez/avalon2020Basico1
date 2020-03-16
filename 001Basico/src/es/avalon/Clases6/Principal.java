package es.avalon.Clases6;

public class Principal {

	public static void main(String[] args) {

		Persona persona = new Persona("Moises");
		DNI dniMoises = new DNI("72171530-Z","19/3/2020",persona);
		persona.setDni(dniMoises);
		
		Persona persona2 = new Persona("Monica");
		DNI dniMoises2 = new DNI("72171531-Z","19/3/2020",persona2);
		persona2.setDni(dniMoises2);
		
		DNI[] lista = new DNI[] {persona.getDni(),persona2.getDni()};
				
		imprimirNombresDeDni(lista);
		
	}
	
	public static void imprimirNombresDeDni(DNI[] lista) {
		
		for (int i=0; i<lista.length;i++) {
			System.out.println(lista[i].getPersona().getNombre());
			System.out.println(lista[i].getNumero() + " " + lista[i].getFechaCaducidad());
		}
	}

}
