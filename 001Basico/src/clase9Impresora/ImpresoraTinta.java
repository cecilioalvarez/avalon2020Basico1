package clase9Impresora;

public class ImpresoraTinta implements Impresora{

	@Override
	public void imprimir(String texto) {
		System.out.println("imprimir a color"+texto);
	}
	

}
