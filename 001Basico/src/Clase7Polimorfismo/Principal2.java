package Clase7Polimorfismo;
import java.util.ArrayList;
public class Principal2 {

	public static void main(String[] args) {
		Deportista d1=new Deportista("Juan",30,"natacion");
		Deportista d2=new Deportista("Jose",31,"padel");
		Deportista d3=new Deportista("Maria",32,"tenis");
		Deportista d4=new Deportista("Ines",33,"futbol");
		
		ArrayList<Deportista> lista=new ArrayList<Deportista>();
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		for(Deportista undeportista:lista) {
			System.out.println(undeportista.getDeporte());
			
		}
		
		//ahora quiero probarlo con Personas, entonces no me cogeria el deporte
		// pero si el nombre
		
		
		ArrayList<Persona> lista2=new ArrayList<Persona>();
		lista2.add(d1);
		lista2.add(d2);
		lista2.add(d3);
		lista2.add(d4);

		for(Persona undeportista:lista2) {
			System.out.println(undeportista.getNombre());
			System.out.println(undeportista.getNombre());
			
		}
		
		
	}

}
