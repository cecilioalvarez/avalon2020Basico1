package es.avalon.Clases1;

public class Factura {
	
	String concepto;
	
	

	int numero;
	double importe;
	double calcularIva() {
		
		
	return importe*1.21;
	
	}
	
	
	double calcularRetencion() {
		
		return importe*1.15;
		
	}
	
	double totalIngresarCuenta() {
		return calcularIva()-calcularRetencion();
		
	}

}
