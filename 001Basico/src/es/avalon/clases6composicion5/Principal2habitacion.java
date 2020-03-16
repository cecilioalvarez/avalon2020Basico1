package es.avalon.clases6composicion5;

import java.util.ArrayList;

public class Principal2habitacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		habitacion h=new habitacion("salon");
		bombilla b1=new bombilla(true);
		bombilla b2=new bombilla(false);
		
		// infinita de bombillas
		h.addBombilla(b1);
		h.addBombilla(b2);
		
		mostrarbombillas(h);
		System.out.println("bombillas encendidas -> "+encendidas(h));
		
		////////// otro metodo
		
//		ArrayList<bombilla> bombillas=h.getBombillas();
//		
//		for (int i=0; i<bombillas.size(); i++) {
//			
//			System.out.println(bombillas.get(i).isEncendida());
//
//		}
//		
		
//		int bombillasON=0;
//		
//		for (int i=0; i<bombillas.size();i++) {
//			
//			if (bombillas.get(i).isEncendida()==true) {
//				
//				bombillasON=bombillasON+1;
//			}
//		}
//		System.out.println("bombillas encendidas -> "+bombillasON);
		
	}

	private static void mostrarbombillas(habitacion h) {
		ArrayList<bombilla> bombillas=h.getBombillas();
		
		for (int i=0; i<bombillas.size(); i++) {
			
			System.out.println(bombillas.get(i).isEncendida());
		}
	}
	
	private static int encendidas(habitacion h) {
		int contador=0;
		ArrayList<bombilla> bombillas=h.getBombillas();
		
		for (int i=0; i<bombillas.size(); i++) {
			
			if (bombillas.get(i).isEncendida()) {
				
				contador++;
			}
		}
		return contador;
	}

}
