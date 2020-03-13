package es.avalon.clases5Repaso;

public class PrincipalRepaso5 {

	public static void main(String[] args) {
		
		Alumno n0=new Alumno();
		n0.nota=5;
		n0.nombre="pedro";
		
		Alumno n1=new Alumno();
		n1.nota=5;
		n1.nombre="ana";
		
		Alumno n2=new Alumno();
		n2.nota=5;
		n2.nombre="gema";
		
		//Agrupando
		Alumno[] alumnos=new Alumno[] {n0,n1,n2};
	
	}
}
