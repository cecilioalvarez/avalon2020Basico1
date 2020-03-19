package es.clases6;
import java.util.*;
import java.text.*;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha=new Date();
		SimpleDateFormat formato=new SimpleDateFormat("d/M/yyyy");
		
		try {
			fecha=formato.parse("19/3/2020");
			
		}catch(ParseException e){
			e.printStackTrace();
			
		}
		
		System.out.println(fecha);
		
		Calendar calendario= Calendar.getInstance();
		calendario.setTime(fecha);
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.YEAR));
	}

}
