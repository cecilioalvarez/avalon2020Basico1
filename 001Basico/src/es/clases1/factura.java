package es.clases1;

public class factura {
private int numero;
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public double getImporte() {
	return importe;
}
public void setImporte(double importe) {
	this.importe = importe;
}
private double importe;
public factura (int numero, double importe) {
	super();
	this.numero=numero;
	this.importe=importe;
			
}
public double calcularIVA() {
	/*
	 * delega en el metodo estático
	 * no hace la operacion por su cuenta
	 */
	return calcularIVA(this.getImporte());
}
public static double calcularIVA (double valor) {
	return valor*1.21;
}




}
//source-> geters setters