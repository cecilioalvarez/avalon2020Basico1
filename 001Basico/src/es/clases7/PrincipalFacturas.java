package es.clases7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

import es.clases4.Persona;

public class PrincipalFacturas {
	public static void main(String[]args) {
		Factura f1= new Factura (34, "tablet", 200);
		Factura f2= new Factura (58, "ordenador", 1200);
		Factura f3= new Factura (23, "raton", 10);
		Factura f4= new Factura (97, "pantalla", 500);
		Factura f5= new Factura (56, "boligrafos", 12);
			HashMap<Integer, Factura> diccionario=new HashMap<Integer,Factura>();
			
			diccionario.put(f1.getNumero(),f1);
			diccionario.put(f2.getNumero(),f2);
			diccionario.put(f3.getNumero(),f3);
			diccionario.put(f4.getNumero(),f4);
			diccionario.put(f5.getNumero(),f5);
			
//			Persona p3=diccionario.get("pedro");
//			System.out.println(p3.getApellidos()+ " "+p3.getEdad());
			
			//System.out.println(diccionario.get("juan"));
			
			//para recorrer el diccionario
			
			Set<Integer> claves= diccionario.keySet();
			for (int clave:claves){
				System.out.println(diccionario.get(clave));//por el toString en la clase persona
			}
			
			//metodo ceci
		System.out.println("***************************");
			int mayor=0;
			for (int numero: claves){
				if (mayor<numero) {
					mayor=numero;
				}
			}
			System.out.println("factura con numeor mas alto es :" + mayor);	
			System.out.println("***************************");
			Collection<Factura> lista= diccionario.values();
			for (Factura f: lista) {
				System.out.println(f);
			}
			
			// metodo maria SOS
			
	//		System.out.println(mayornumero(diccionario.));
	}
//	public static Factura mayorNumero(HashMap<Integer,Factura> factura) {
//		 //obtengo el primer elemento de la lista
//		 Factura f=Factura.get(0);
//		 for (Factura i: factura) {
//			 //int edad=40;
//			 if(f.getNumero()< i.getNumero()){
//				 //System.out.println(i.getNombre()+ " "+i.getEdad());
//				f=i;
//		 }
//		 }
//		 return f;
//	 }
}
