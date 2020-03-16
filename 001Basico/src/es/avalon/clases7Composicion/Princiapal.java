package es.avalon.clases7Composicion;

public class Princiapal {

	public static void main(String[] args) {
		//creamos el paciente
		Paciente p1= new Paciente("pedro");
		//creamos el historial
		//asigna el historial al paciente
		HistorialMedico h1 = new HistorialMedico("catarro",p1);
		
		p1.setHistorial(h1);		
		// imprimo el nombre
		System.out.println(p1.getNombre());
		
		// aqui accedo a la propiedad de historial de enfermedad
		//accedo a la relacion
		System.out.println(p1.getHistorial().getEnfermedad());
		

	}

}
