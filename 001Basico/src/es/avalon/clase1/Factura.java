package es.avalon.clase1;

public class Factura {

	int numero;
	String concepto;
	double importe;
	
	double CalcularIVA21() {
		
		return importe*1.21;
	}
	
	double Retencion() {
		return importe*0.15;
	}
	double Ingreso() {
		return CalcularIVA21()-Retencion();
	}
}
