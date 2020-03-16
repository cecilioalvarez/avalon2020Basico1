package Clase6Composicion2;

public class Principal {

	public static void main(String[] args) {
		Persona p= new Persona("gema");
		Dni dni=new Dni("1","hoy",p);
		p.setDni(dni);

		Persona p2= new Persona("Marta");
		Dni dni2=new Dni("1","hoy",p2);
		p2.setDni(dni2);
		
		Dni[] lista= new Dni[] {p.getDni(),p2.getDni()};
		
		imprimirNombreDeDni(lista);
	}
public static void imprimirNombreDeDni (Dni[] lista) {
	
	for(int i=0;i<lista.length;i++) {
		System.out.println(lista[i].getPersona().getNombre());
	}
	
}
}
