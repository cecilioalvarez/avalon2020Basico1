package es.clases6;

public class GuardarPDF implements Impresora {
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void imprimir(String texto) {
		// TODO Auto-generated method stub
		System.out.println(texto +" ha sido guardado en PDF");
	}

}
