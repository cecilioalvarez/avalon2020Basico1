package es.avalon.clases11Interfaces4;

public class Principal {

	public static void main(String[] args) {
		
		//Creo el documento
		//Impresora que implemente el interface
		Word documento=new Word();
		documento.imprimirDocumento("Hola");
		
		//Le asigno una impresora
		documento.setImpresora(new Impresoralaser());
		documento.imprimirDocumento("Hola ¿que tal?");
		
	}
}
