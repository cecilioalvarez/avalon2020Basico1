package es.avalon.clases8herencia2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p=new Persona(23,"Jose");
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		
		Deportista d=new Deportista(24,"Sara","Natacion");
		
		System.out.println(d.getNombre());
		System.out.println(d.getEdad());
		System.out.println(d.getDeporte());
		
		Deportista d2=new Deportista(23,"Juan");
		System.out.println(d2.getNombre());
		System.out.println(d2.getEdad());
		System.out.println(d2.getDeporte());
		
	}
}
