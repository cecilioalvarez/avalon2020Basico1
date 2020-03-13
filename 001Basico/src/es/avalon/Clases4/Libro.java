package es.avalon.Clases4;

public class Libro {

	private String titulo;
	private static int contador = 0;
	
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		Libro.contador = contador+1;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Libro.contador = contador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
