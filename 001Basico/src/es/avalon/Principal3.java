package es.avalon;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
        System.out.println("Tio, ¿que nota sacaste en el examen?");
        int numero =0;
        numero=reader.nextInt();

		if (numero < 5) {

			System.out.println("has suspendido");
		} else if (numero > 5 && numero < 8) {

			System.out.println("has aprobado ");
		}

		else {
			System.out.println("has hecho buen examen");
		}
		
		System.out.println("todo ok moises 100");

	}

}
