package es.avalon.interfaces4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo el documento
		// impresora que implemente el interface
		
		Word documento=new Word();
		documento.imprimirDocumento("Hola");
		
		// le asigno una impresora
		documento.setImpresora(new ImpresoraTinta());
		documento.imprimirDocumento("Hola2");
	}
}
