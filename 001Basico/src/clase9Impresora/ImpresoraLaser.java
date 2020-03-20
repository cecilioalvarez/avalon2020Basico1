package clase9Impresora;

public class ImpresoraLaser implements Impresora {
	
	@Override
	public void imprimir(String texto) {
		System.out.println("imprimir a b/n"+texto);
	}
}
