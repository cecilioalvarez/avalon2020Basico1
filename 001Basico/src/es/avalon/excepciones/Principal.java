package es.avalon.excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Date fecha= new Date();
		
		SimpleDateFormat formato= new SimpleDateFormat("d/M/yyyy");
		
		try {
			fecha=formato.parse("19/3/2020");
			System.out.println(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar calendario= Calendar.getInstance();
		calendario.setTime(fecha);
		
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.YEAR));

	}

}
