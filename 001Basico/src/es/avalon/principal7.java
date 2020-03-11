package es.avalon;

public class principal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		numeros(5);
		numRecursive(5);
	}
	
	private static void numeros(int valor) {
		for (int i = 0; i<valor; i++) {
			System.out.println(i);
		}
	}
	
	private static void numRecursive(int valor) {
		if (valor > 0) {
			System.out.println(valor);
			valor--;
			numRecursive(valor);
		}
		else {
			System.out.println(0);
		}
	}
		
}
