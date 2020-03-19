package es.avalon.dClases10EjercicioImpresora;

public class Principal {

	public static void main(String[] args) {

		ImpresoraLaser impresoraLaser= new ImpresoraLaser();
		ImpresoraTinta impresoraTinta= new ImpresoraTinta();
		GeneradorPDF generadorPDF = new GeneradorPDF();
		Word word = new Word(impresoraLaser);
		Word word1 = new Word(impresoraTinta);
		Word word2 = new Word(generadorPDF);
		
		word.imprimirDocumento("Hola");
		word1.imprimirDocumento("Hola");
		word2.imprimirDocumento("Hola");
		
	}

}
