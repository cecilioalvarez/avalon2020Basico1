package es.avalon.clase1;

public class Libro {
	private String titulo;
	private static int contador=0;
	
	
	
	public static Libro(int contador) {
		super();
		this.contador = contador;
		this.contador=contador+1;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		this.contador = contador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo) {
		super();
		this.titulo = titulo;
	}
	

}
