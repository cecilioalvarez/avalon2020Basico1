package es.avalon.clases6composicion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente p1 = new Paciente("pedro");
		
		//Se crea historial
		//Se agina el paciente al historial
		HistorialMedico h1 = new HistorialMedico("catarro", p1);
		
		//Asigna el historial al paciente
		p1.setHistorial(h1);
		
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getHistorial().getEnfermedad());

	}

}
