package es.avalon.clases5repaso;

public class Principal4 {

	public static void main(String[] args) {

		// un trillon
		int[] notas = new int[] { 5, 7, 9 };
		String[] nombres = new String[] { "pedro", "ana", "gema" };

		/////////////////////////////////////////////////////

		
		System.out.println(nombreMayorNota(notas,nombres));		
		System.out.println(calcularMedia(notas));

	}
	
	// para obtener el nombre de la persona con mejor nota
	private static String nombreMayorNota(int[] notas ,String[] nombres) {
		int notaInicial = 0;
		int posicionMayor = 0;

		for (int i = 0; i < notas.length; i++) {

			if (notaInicial < notas[i]) {

				posicionMayor = i;
				notaInicial = notas[i];
			}
		}
		return nombres[posicionMayor];
	}

	// ubicada en una funcion para su reutilizacion
	private static int calcularMedia(int[] notas) {
		int media = 0;

		for (int i = 0; i < notas.length; i++) {

			media = media + notas[i];

		}
		return media/notas.length;
	}

}
