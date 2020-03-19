package es.avalon.clases11Interfaces4;

public class Impresoratinta implements Impresora {

	@Override
	public void imprimir(String texto) {
		System.out.println("La Impresora Tinta imprime a color el texto "+texto);
	}

}
