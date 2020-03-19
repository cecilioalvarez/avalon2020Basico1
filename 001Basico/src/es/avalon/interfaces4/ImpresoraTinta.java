package es.avalon.interfaces4;

public class ImpresoraTinta implements Impresora {

	
	@Override
	public void imprimir(String texto) {
		
		System.out.println("Imprime a color el texto "+ texto);
		
	}

	
}
