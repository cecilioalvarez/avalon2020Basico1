package Clase6Composicion;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1=new Paciente("Pedro");
		HistorialMedico h1=new HistorialMedico("Catarro",p1);
		p1.setHistorial(h1);
		
		System.out.println(p1.getHistorial());
		System.out.println(p1.getHistorial().getEnfermedad());
	}

}
