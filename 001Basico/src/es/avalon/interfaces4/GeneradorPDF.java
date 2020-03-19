package es.avalon.interfaces4;

public class GeneradorPDF implements Impresora {

	@Override
	public void imprimir(String texto) {
		
		System.out.println("Imprime en PDF el texto "+texto);
		
	}

}
