package es.avalon.clases4;

public class Libro {

	private String titulo;
	//declaracion estatica para contador
	private static int contador=0;
	
	//genero los metodos get y set como estaticos para contador
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Libro.contador=contador;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public Libro(String titulo) {
		super();
		this.titulo=titulo;
		contador=contador+1;
	}
}
