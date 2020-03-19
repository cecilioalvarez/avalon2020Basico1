package es.avalon.interfaces4;

public class ImpresoraLaser implements Impresora {

	@Override
	public void imprimir(String texto) {
		System.out.println(""+texto);

	}

}
