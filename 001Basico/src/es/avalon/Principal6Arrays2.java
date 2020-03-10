package es.avalon;

public class Principal6Arrays2 {
public static void main(String[] args) {
	
	// Subir un punto de la nota a los suspensos
		
		int [] notas = new int [] {3,4,4,5,9};
		
	
		
		for(int i=0; i<notas.length; i++) {
			
			
			if (notas[i]<5) {
				notas[i]=notas[i]+1;
			}
		}
		
		for (int i=0;i<notas.length;i++) {
			
			System.out.println(notas[i]);
		}

	}
}
