package es.avalon.Clases1;

public class Factura {

	int numeroFactura;
	String concepto;
	double importe;
	
	double calculaIVA() {
		return importe*1.21;
	}
	
	double calculaRetencion() {
		return importe*0.15;
	}
	
	double totalIngeresarCuenta() {
		return calculaIVA()-calculaRetencion();
	}
	
}
