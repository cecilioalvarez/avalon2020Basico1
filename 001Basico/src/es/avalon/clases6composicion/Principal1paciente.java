package es.avalon.clases6composicion;

public class Principal1paciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creamos el paciente
		paciente p1=new paciente("Pedro");
		// creamos el historial
		// asignamos el paciente al historial
		historialmedico h1=new historialmedico("catarro",p1);
		// asignamos el historial al paciente
		p1.setHistorial(h1);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getHistorial().getEnfermedad());
		
	}

}
