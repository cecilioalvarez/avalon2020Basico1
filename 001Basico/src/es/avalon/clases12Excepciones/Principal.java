package es.avalon.clases12Excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		Date fecha = new Date();

		SimpleDateFormat formato = new SimpleDateFormat("d/M/yyyy");
		// Puede dar problemas

		// Genera o puede generar una excepcion
		try {
			fecha = formato.parse("19/3/2020");
		} catch (ParseException e) {
			// Imprime el mensaje de error
			System.out.println(e.getMessage());
		}
		// Por completo
		System.out.println(fecha);
		
		//Calendario
		Calendar calendario = Calendar.getInstance();
		
		//Definimos la fecha establecida antes en el calendario (Decimos al calendario que estamos en: fecha 19/3/2020 )
		calendario.setTime(fecha);
		
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_WEEK)); //Los dias de la semana empiezan el domingo ->Domingo dia 1, jueves dia 5
		System.out.println(calendario.get(Calendar.MONTH)); //Los meses empiezan a contar en 0 ->Enero mes 0, marzo dia 3
		System.out.println(calendario.get(Calendar.YEAR));
	}

}
