package es.clases4;

import java.util.ArrayList;

public class Principal2 {
 public static void main (String []args) {
	 FacturaConIVA F1= new FacturaConIVA(1258, "Clases Marzo", 450.8);
	 FacturaReducida F2= new FacturaReducida(12, "Clases Abril Universidad", 350.5);
	 FacturaSinIVA F3= new FacturaSinIVA(8, "Clases Marzo ONCE", 150.8);
	 System.out.println("la factura "+ F1.getNumero()+" tiene un importe "+F1.getImporte() +" € que con el iva es: " + F1.conIVA()+ " € con concepto: "+ F1.getConcepto());
	 System.out.println("la factura "+ F2.getNumero()+" tiene un importe "+F2.getImporte() +" € que con el iva es: " + F2.conIVA()+ " € con concepto: "+ F2.getConcepto());
	 System.out.println("la factura "+ F3.getNumero()+" tiene un importe "+F3.getImporte() +" € que con el iva es: " + F3.conIVA()+ " € con concepto: "+ F3.getConcepto());

}
}