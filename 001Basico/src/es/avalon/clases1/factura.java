package es.avalon.clases1;

public class factura {

	int numero;
	String concepto;
	double importe;
	
	double calcularIVA() {
		
		return importe*0.21+importe;
	}
	
	double calcularRetencion() {
		
		return importe*0.15;
		
	}
	
	double totalingresarcuenta() {
		
		return calcularIVA()-calcularRetencion();
	}
}
