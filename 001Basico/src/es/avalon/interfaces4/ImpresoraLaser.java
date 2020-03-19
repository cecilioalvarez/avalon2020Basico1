package es.avalon.interfaces4;

public class ImpresoraLaser implements Impresora {

	@Override
	public void imprimir(String texto) {
		
		System.out.println("Imprime a blanco y negro el texto "+texto);
		
	}

}
