package clase9Impresora;

public class GeneradorPDF implements Impresora {
	
	@Override
	public void imprimir(String texto) {
		System.out.println("imprimir a PDF"+texto);
	}
}
