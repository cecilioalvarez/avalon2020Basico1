package Clase6Composicion;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1=new Paciente("Pedro");
		HistorialMedico h1=new HistorialMedico("Catarro",p1);
		p1.setHistorial(h1);
		
		// en esta linea estas imprimiendo el historial que es
		//un objeto y por lo tanto sale su referencia a memoria
		// lo que necesitas es imprimir la enfermedad
		System.out.println(p1.getHistorial());
		//y es aqui donde la imprimes correctamente
		System.out.println(p1.getHistorial().getEnfermedad());
	}

}
