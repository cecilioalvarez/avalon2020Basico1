package es.avalon.interfaces4;

public class Principal {

	public static void main(String[] args) {
		
		// creo el documento
		//impresora que implemente el interface
		
		Word documento= new Word();
		documento.imprimirTexto("hola");
		
		//le asigno una impresora
		documento.setImpresora(new ImpresoraColor());
		documento.imprimirTexto("hola2");

	}

}
