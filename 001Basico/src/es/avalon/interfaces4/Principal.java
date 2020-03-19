package es.avalon.interfaces4;

public class Principal {

	public static void main(String[] args) {
		
		// Definimos impresoras
		
		Impresora i1 = new ImpresoraTinta();
		Impresora i2 = new ImpresoraLaser();
		Impresora i3 = new GeneradorPDF();
		
		// Definimos los Words
		Word w1 = new Word(i1);
		Word w2 = new Word(i2);
		Word w3 = new Word(i3);
		
		//Imprimo cosas
		w1.imprimirTexto("Hola");
		w2.imprimirTexto("Hola");
		w3.imprimirTexto("Hola");
		
		// Otra forma de hacerlo 
		// Word documento = new Word(new ImpresoraTinta());
		


	}

}
