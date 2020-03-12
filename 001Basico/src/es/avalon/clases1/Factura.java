package es.avalon.clases1;

public class Factura {
	int numero;
	String concepto;
	double importe;
	
	double calcularIVA() {
		return importe*1.21;
	}
	
	double retencion() {
		return importe*0.15;
	}
	
	double totalingresarCuenta() {
		return calcularIVA()-retencion();
	}
}
