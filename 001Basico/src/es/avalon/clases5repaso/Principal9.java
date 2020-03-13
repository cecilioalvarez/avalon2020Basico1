package es.avalon.clases5repaso;

public class Principal9 {

	public static void main(String[] args) {

		
		Alumno n0 = new Alumno("pedro",5);
		Alumno n1 = new Alumno("ana",7);
		Alumno n2 = new Alumno("gema",9);
		
		//agrupado la informacion de una forma más sencilla de manejar
		Alumno[] alumnos=new Alumno[] { n0,n1,n2};
		
		
		
		System.out.println(nombreMayorNota(alumnos).getNombre());
		System.out.println(calcularMedia(alumnos));

	}
	

	
	private static Alumno nombreMayorNota(Alumno[] alumnos) {
		
		Alumno alumno=alumnos[0];

		for (int i = 0; i < alumnos.length; i++) {

			alumno=alumno.esMejor(alumnos[i]);
	
		}
		return alumno;
	}

	
	private static int calcularMedia(Alumno[] alumnos) {
		int media = 0;

		for (int i = 0; i < alumnos.length; i++) {

			media = media + alumnos[i].getNota();

		}
		return media/alumnos.length;
	}

}
