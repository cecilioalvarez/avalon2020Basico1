package es.avalon.clases4;

public class libro {

	private String titulo;
	// declaro la variable contador como estatica
	// y declaro los emtodos set y get como estaticos
	private static int contador;
		
	public String gettitulo() {
		return titulo;
	}
	
	public void settitulo(String titulo) {
		this.titulo=titulo;
	}
	public static int getcontador() {
		return contador;
	}
	
	public static void setcontador(int contador) {
		libro.contador=contador;
	}
	
	public libro(String titulo) {
		super();
		this.titulo = titulo;
		libro.contador=contador+1;
	}
}
