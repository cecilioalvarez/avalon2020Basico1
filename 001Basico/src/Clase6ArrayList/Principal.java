package Clase6ArrayList;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		ArrayList<String> lista=new  ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("qtal");
		lista.add("estas");
		

		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		lista.remove("tal");
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println(lista.contains("hola"));
		System.out.println(lista.contains("que"));
		System.out.println(lista.contains("tal"));
		System.out.println(lista.contains("estas"));
	}

}
