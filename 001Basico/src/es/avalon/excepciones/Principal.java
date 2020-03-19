package es.avalon.excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// esto genera una fecha inicial
		Date fecha=new Date();
		
		SimpleDateFormat formato=new SimpleDateFormat("d/M/yyyy");
		
		// puede dar problemas

		try {
			// genera o puede generar una excepcion
			fecha=formato.parse("19/03/2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// sacamos la fecha por completo
		System.out.println(fecha);
		
		Calendar calendario=Calendar.getInstance();
		
		calendario.setTime(fecha);
		
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.YEAR));
		
		
	}

}
