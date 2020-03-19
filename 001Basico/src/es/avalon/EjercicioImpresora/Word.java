package es.avalon.EjercicioImpresora;

public class Word {

	private Impresora impresora;
	
	public Word(Impresora impresora) {
		super();
		this.impresora = impresora;
	}

	public Impresora getImpresora() {
		return impresora;
	}

	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}

	public  void imprimirDocumento(String texto) {
		System.out.println("Imprimiendo " + texto);
		impresora.imprimir();
		
	}
}
