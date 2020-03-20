package clase9Impresora;

public class Principal {

	public static void main(String[] args) {
		
		Word documento=new Word(new ImpresoraLaser());
		documento.imprimirTexto("hola");
		documento.setImpresora(new ImpresoraTinta());
		documento.imprimirTexto("hola2");

	}

}
