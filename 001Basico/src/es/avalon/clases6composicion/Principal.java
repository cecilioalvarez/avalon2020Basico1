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
		
		
		//realizado en dos pasos
		HistorialMedico historial=p1.getHistorial();
	
		System.out.println(historial);
		
		System.out.println(historial.getEnfermedad());
	
		//realizado de golpe en un paso
		
		System.out.println(p1.getHistorial().getEnfermedad());
		
		
		

	}

}
