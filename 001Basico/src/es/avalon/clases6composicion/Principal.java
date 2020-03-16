package es.avalon.clases6composicion;

public class Principal {

	public static void main(String[] args) {

		//creamos el paciente
		Paciente p1=new Paciente("pedro");
		
		//Creamos el historial
		//Asigno el paciente al historial
		Historialmedico h1=new Historialmedico("catarro",p1);

		//porque esto asigna el historial al paciente
		p1.setHistorial(h1);
		
		//Imprimo el nombre
		System.out.println(p1.getNombre());
		
		//Aqui accedo a la propiedad de historal de enfermedad
		//Accedo a la relacion
		System.out.println(p1.getHistorial().getEnfermedad());
	}

}
