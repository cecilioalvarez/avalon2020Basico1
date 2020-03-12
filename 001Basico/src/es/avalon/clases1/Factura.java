package es.avalon.clases1;

public class Factura {
	
	int Numero;
	String Concepto;
	double Importe;
	
	
	//Funciones (IVA: 21%; Retención 15%)
	
	double calcularIVA() {
		return Importe*1.21;
	}
	
	double calcularRetencion() {
		return Importe*1.15;
	}
}