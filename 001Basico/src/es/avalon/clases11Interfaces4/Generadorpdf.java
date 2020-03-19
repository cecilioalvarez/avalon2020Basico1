package es.avalon.clases11Interfaces4;

public class Generadorpdf implements Impresora {

	@Override
	public void imprimir(String texto) {
		System.out.println("El Generador de PDF imprime en PDF "+texto);
		
	}

}
