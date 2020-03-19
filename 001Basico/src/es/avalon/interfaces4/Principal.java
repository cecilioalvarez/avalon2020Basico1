package es.avalon.interfaces4;

public class Principal {

	public static void main(String[] args) {
		Word documento=new Word();
		
		documento.imprimirTexto("hola");
		documento.setImpresora(new ImpresoraColor());
		documento.imprimirTexto("hola2");

	}

}
