package es.clases3;

public class Principal1 {

	public static void main(String[] args) {
//		//cra paciente
//		Paciente p1= new Paciente ("Pedro");
//		//asigna el historial al paciente 
//		//crea hisotrial
//		HistorialMedico h1= new HistorialMedico("Catarro",p1);
//		p1.setHistorial(h1);// asigna al paciente el historial
//		System.out.println(p1.getNombre());
//		//accedo a la relacion y a la propiedad de historial de enfermedad
//		System.out.println(p1.getHistorial().getEnfermedad());

//		//crea persona
//				Persona p1= new Persona ("Pedro");
//				//asigna el historial al paciente 
//				
//				//crea dni
//				DNI d1= new DNI(p1, 123456789, "13/2/89");
//				
//				
//				//que estoy haciendo aqui? 
//				/*Pregutnas:
//				 * -a que metodo estoy refernciadno, todo!
//				 * -por que solo saco el nombre, si quiero sacar todo
//				 * -
//				 */
//				System.out.println(d1.getPersona().getNombre() );
//				System.out.println(d1.getNumero() );
//				System.out.println(d1.getFechaCaducidad());
//				//accedo a la relacion y a la propiedad de historial de enfermedad
//				//System.out.println(p1.getHistorial().getEnfermedad());

		Bombilla b1 = new Bombilla(true);
		System.out.println(b1.isBombilla());
		b1.apagado();
		System.out.println(b1.isBombilla());
		//faltaba la llave aqui
	}

	public static void imprimirEstadoBombilla(Bombilla b) {
		if (b.isBombilla() == true) {
			System.out.println("encendido");
		} else {
			System.out.println("apagada");
		}
	}

}
