package es.clases2;
import es.clases1.telefono;

import es.clases1.alumnos;
import es.clases1.persona;
import es.clases1.*;

public class Principal {
public static void main (String[]arg) {

	Libro l= new Libro ("java");
.out.println(l.getTitulo());
	
	Libro l2= new Libro ("java");
		Libro l3= new Libro ("java2");
		System.out.println(l2.getTitulo());
		
		System.out.println(l3.getContador());
		
//		alumnos a= new alumnos("pepe", 7);
//		alumnos a2= new alumnos("ana", 5);
//		System.out.println(a.getnota());
//		System.out.println(a2.getnota());
//		
//		
////	telefono t= new telefono();
//////		t.numero=123456789;
//////		System.out.println(t.numero);
////		t.setNumero(123456799);
////		System.out.println(t.getNumero());
////		alumnos a= new alumnos();
////		a.setNota(8);
////		System.out.println(a.getNota());
////		
//		
	tableta t= new tableta ("apple", 1000);
	tableta t2= new tableta (800);
	System.out.println(t.getMarca());
	System.out.println(t.getPrecio());
	System.out.println(t.getPrecioconIVA());
	System.out.println(t.getPrecioconIVA(10));
	System.out.println(t2.getMarca());
	System.out.println(t2.getPrecio());
	System.out.println(t2.getPrecioconIVA());
	System.out.println(t2.getPrecioconIVA(10));
	}
	
	}


