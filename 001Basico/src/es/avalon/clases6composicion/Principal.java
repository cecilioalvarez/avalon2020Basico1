package es.avalon.clases6composicion;

public class Principal {

	public static void main(String[] args) {
		
		//creamos el paciente
		Paciente p1= new Paciente("pedro");
		
		
		//creamos el historial
		
		
		//asigna el paciente al historial
		HistorialMedico h1= new HistorialMedico("catarro",p1);
		
		
		
		
		// porque esto asigna el historial al paciente
		p1.setHistorial(h1);
		
		// imprimo el nombre
		System.out.println(p1.getNombre());
		
		
		// aqui accedo a la propiedad de historialde enfermedas
		// accedo a la relacion
		System.out.println(p1.getHistorial().getEnfermedad());
		
		
		

	}

}
