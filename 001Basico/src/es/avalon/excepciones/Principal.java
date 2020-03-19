package es.avalon.excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Date fecha= new Date();
		
		SimpleDateFormat formato= new SimpleDateFormat("d/M/yyyy");
		
		try {
			fecha=formato.parse("1/10/2020");
			System.out.println(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
