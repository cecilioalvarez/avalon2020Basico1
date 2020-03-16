package es.avalon.clases5repaso;

public class Principal6 {
	
	public static void main(String[] args ) {
		
		Alumno n0 = new Alumno("pedro",25);
		
		Alumno n1 = new Alumno("ana",7);
		
		Alumno n2 = new Alumno("gema", 9);
	
		
		//Lista de alumnos
		Alumno[] alumnos=new Alumno[] {n0,n1,n2};
		
		//Print
		System.out.println(nombreMayorNota(alumnos));
		System.out.println(calcularMedia(alumnos));


		
	}

	private static String nombreMayorNota(Alumno[] alumnos) {
		int notaInicial = 0;
		int posicionMayor = 0;
		
		for (int i=0; i<alumnos.length; i++) {
			if (notaInicial<alumnos[i].getNota())  {
				
				notaInicial=alumnos[i].getNota();
				posicionMayor=i;
			}
		}
		return alumnos[posicionMayor].getNombre();
	}

	private static double calcularMedia(Alumno[] alumnos) {
		int media = 0;
		
		for (int i=0; i<alumnos.length; i++) {	
			media = media+alumnos[i].getNota();
		}
		return media/alumnos.length;
	}
}			
