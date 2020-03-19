package es.avalon.clases11Interfaces4;

public class Impresoralaser implements Impresora {

	@Override
	public void imprimir(String texto) {
		System.out.println("La Impresora Laser imprime en b/n "+texto);	
	}

}
