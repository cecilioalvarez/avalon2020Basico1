package es.avalon;

public class Principal5 {
//Vamos a hacer arrays
	public static void main(String[] args) {
//		int[] numeros=new int[] {1,2,3};
//		
//		System.out.println(numeros[0]);
//		System.out.println(numeros[1]);
//		System.out.println(numeros[2]);
//		
//		for(int i=0; i<numeros.length; i++) {
//			System.out.print(numeros[i]);
//		}
		int[] notas=new int[] {1,5,2,4,6};
		
		for(int i=0; i<notas.length;i++) {
			if (notas[i]<5) {
				notas[i]=notas[i]+1;
			}
			System.out.print(notas[i]);
		}
	
		
		}
	}


