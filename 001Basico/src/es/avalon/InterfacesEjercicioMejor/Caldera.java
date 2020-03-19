package es.avalon.InterfacesEjercicioMejor;

public class Caldera implements ElementoCasa {

	private boolean estado;
	private String nombre;

	public Caldera(String nombre) {
		super();
		this.estado = false;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public boolean pulsar() {
		if (isEstado() == false) {
			setEstado(true);
		} else {
			setEstado(false);
		}
		return isEstado();
	}

}
