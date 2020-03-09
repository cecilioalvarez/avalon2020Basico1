package es.avalon;

import java.util.Scanner;

public class Principal3b {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
	       
        System.out.println("¿Que sacaste en el examen?");
        numero=sc.nextInt();
       
       
        if(numero < 5) {
			 
            System.out.println("Suspenso");
 
        }else if( numero < 5) {
 
            System.out.println("Suficiente");
 
        }else if( numero < 7) {
 
            System.out.println("Bien");
 
        }else if (numero < 9) {
 
            System.out.println("Notable");
 
        }else {
 
            System.out.println("Sobresaliente");
 
        }


		

	}

}
