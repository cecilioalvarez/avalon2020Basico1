package es.clases6;

import java.util.*;
public class Prinicpal7_HashTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> conjunto= new TreeSet<String>();
conjunto.add("hola");
conjunto.add("adios");
conjunto.add("bicho");

for (String cadena:conjunto) {
	System.out.println(cadena);
}
System.out.println("****************");

Set<String> conjunto2= new HashSet<String>();
conjunto2.add("hola");
conjunto2.add("adios");
conjunto2.add("bicho");
conjunto2.add("bicho");


for (String cadena2:conjunto2) {
	System.out.println(cadena2);
}
	}

}
