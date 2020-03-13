package es.avalon.clases5Repaso;

public class PrincipalRepaso7 {

	public static void main(String[] args) {
		
		Alumno n0=new Alumno("pedro",25);
		
		Alumno n1=new Alumno("ana",7);
		
		Alumno n2=new Alumno("gema",5);

		
		//Agrupando la informacion de una forma mas sencilla para manejar
		Alumno[] alumnos=new Alumno[] {n0,n1,n2};
		
		System.out.println(nombreMayorNota(alumnos));
		System.out.println(calcularMedia(alumnos));
	
	}
}
