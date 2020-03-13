package es.avalon.clases4;

public class Libro {
	
	private String titulo;
	
	//static hace que contador pertenezca a la clase
	private static int contador = 0;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Libro.contador = contador;
	}
	
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.contador = contador+1;
	}
}
