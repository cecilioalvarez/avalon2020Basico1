package Clase7Polimorfismo;
import java.util.ArrayList;
public class Principal2 {

	public static void main(String[] args) {
		ArrayList<Deportista> lista=new ArrayList<Deportista>();
		lista.add("Juan",30,"natacion");
		lista.add("Jose",31,"padel");
		lista.add("Maria",32,"tenis");
		lista.add("Ines",33,"futbol");

		for(Integer i:lista) {
			System.out.println();
			
		}
	}

}
