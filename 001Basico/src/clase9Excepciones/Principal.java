package clase9Excepciones;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) {
		//un metodo deprecado porque ya se dice que 
		//en el fututo puede esta eliminitadi
		Date fecha=new Date();
		
		SimpleDateFormat formato=new SimpleDateFormat("d/M/yyyy");
		
		
		//a fecha le voy a dar el formato que he puesto arriba y lo que voy a hacer
		//es parsearlo que es convertirlo al formato que yo quiero
		try {
			fecha=formato.parse("1/10/2020");
			System.out.println(fecha);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		//Calendario
		Calendar calendario=Calendar.getInstance();
		//get instance te genera un tipo calendario
		//funciona asi y tu le pones la fecha
		
		calendario.setTime(fecha);
		
		System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.YEAR));

	}

}
