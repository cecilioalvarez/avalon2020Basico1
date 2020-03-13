package es.avalon.clases4;

public class Libro {

	private String titulo;
	//declaracion estatica
	private  static int contador=0;
	
	//he generado los metodos set/get como estaticos
	public  static int getContador() {
		return contador;
	}

	public  static void setContador(int contador) {
		Libro.contador = contador;
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
		Libro.contador=contador+1;
	}
	
	
}
