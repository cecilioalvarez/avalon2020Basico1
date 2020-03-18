package es.avalon.clases9Polimorfismo2;

import java.math.BigDecimal;

public class Redondeo {

	public static void main(String[] args) {
		double a=1.78345;
		double b=1.845677;
		BigDecimal numero=new BigDecimal(1.723456);
		BigDecimal numero2=new BigDecimal(1.723456);
		
		BigDecimal otro=numero.multiply(numero2);
		
		System.out.println(otro);
	}
}
