package es.avalon.clases5repaso;

public class Principal6 {

	public static void main(String[] args) {

		
		Alumno n0 = new Alumno();
		n0.setNota(25);
		n0.setNombre("pedro");
		
		Alumno n1 = new Alumno();
		n1.setNota(7);
		n1.setNombre("ana");
		
		Alumno n2 = new Alumno();
		n2.setNota(9);
		n2.setNombre("gema");
		
		//agrupado la informacion de una forma más sencilla de manejar
		Alumno[] alumnos=new Alumno[] { n0,n1,n2};
		
		
		
		System.out.println(nombreMayorNota(alumnos));
		System.out.println(calcularMedia(alumnos));

	}
	

	
	private static String nombreMayorNota(Alumno[] alumnos) {
		int notaInicial = 0;
		int posicionMayor = 0;

		for (int i = 0; i < alumnos.length; i++) {

			if (notaInicial < alumnos[i].getNota()) {

				posicionMayor = i;
				notaInicial = alumnos[i].getNota();
			}
		}
		return alumnos[posicionMayor].getNombre();
	}

	
	private static int calcularMedia(Alumno[] alumnos) {
		int media = 0;

		for (int i = 0; i < alumnos.length; i++) {

			media = media + alumnos[i].getNota();

		}
		return media/alumnos.length;
	}

}
