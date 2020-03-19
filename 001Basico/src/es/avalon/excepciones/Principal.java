package es.avalon.excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		// esto genera una fecha inicial
		
		Date fecha= new Date();
		
		
		
		
		SimpleDateFormat formato= new SimpleDateFormat("d/M/yyyy");
		
		// puede dar problemas
		
	
			// genera o puede generar una excepcion
			try {
				
				fecha=formato.parse("19/3/2020");
			
			} catch (ParseException e) {
				//imprime el mensaje de error
				
				System.out.println(e.getMessage());
			}
			// por completo
			System.out.println(fecha);
			
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(fecha);
			
			//System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
			
			System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
			
			System.out.println(calendario.get(Calendar.MONTH));
			
			System.out.println(calendario.get(Calendar.YEAR));
		

	}

}
