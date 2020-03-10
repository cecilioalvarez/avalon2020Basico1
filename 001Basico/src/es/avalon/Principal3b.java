package es.avalon;

import java.util.Scanner;

public class Principal3b {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
	       
        System.out.println("Tio, ¿que nota sacaste en el examen?");
        numero=sc.nextInt();
       
       
        if(numero < 5) {
			 
            System.out.println("Que horror");
 
        }else if( numero < 5) {
 
            System.out.println("Por los pelos");
 
        }else if( numero < 7) {
 
            System.out.println("Ni tan mal");
 
        }else if (numero < 9) {
 
            System.out.println("Nada mal bro");
 
        }else {
 
            System.out.println("OLE OLE Notaza");
 
        }

	}

}
