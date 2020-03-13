package es.avalon.clases5;

public class Libro {
	 private String titulo;
	 private static int contador=0;
	 public static int getContador() {
		 return contador;
		 
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
		
	}

}
