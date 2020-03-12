package es.avalon;

public class factura {
	int numbfactura;
	String concepto;
	double importe;
	// con iva
	double iva(){
		
		return 1.21*importe;
	}
	double retencion(){
		return 0.85*importe;
		}
	double totalpago() {
		return importe-0.15*importe+0.21*importe;
		
	}
	}
