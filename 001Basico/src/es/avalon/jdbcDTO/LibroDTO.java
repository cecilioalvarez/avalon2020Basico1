package es.avalon.jdbcDTO;

public class LibroDTO {

	private String isbn;
	private String titulo;
	private String autor;
	private int precio;
	private String categoriaNombre;
	private String categoroaDescripcion;
	
	public LibroDTO(String isbn, String titulo, String autor, int precio, String categoriaNombre,
			String categoroaDescripcion) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.categoriaNombre = categoriaNombre;
		this.categoroaDescripcion = categoroaDescripcion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCategoriaNombre() {
		return categoriaNombre;
	}

	public void setCategoriaNombre(String categoriaNombre) {
		this.categoriaNombre = categoriaNombre;
	}

	public String getCategoroaDescripcion() {
		return categoroaDescripcion;
	}

	public void setCategoroaDescripcion(String categoroaDescripcion) {
		this.categoroaDescripcion = categoroaDescripcion;
	}
	
	
	
	
}