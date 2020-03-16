package es.clases3;

public class Principal1 {

	public static void main(String[] args) {
		//cra paciente
		Paciente p1= new Paciente ("Pedro");
		//asigna el historial al paciente 
		//crea hisotrial
		HistorialMedico h1= new HistorialMedico("Catarro",p1);
		p1.setHistorial(h1);// asigna al paciente el historial
		System.out.println(p1.getNombre());
		//accedo a la relacion y a la propiedad de historial de enfermedad
		System.out.println(p1.getHistorial().getEnfermedad());
	}

}
