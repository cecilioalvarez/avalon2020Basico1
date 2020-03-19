package es.avalon.dClases10InterfacesEjercicioMejor;

public class Television implements ElementoCasa {

	private boolean estado;
	private String nombre;

	public Television(String nombre) {
		super();
		this.estado = false;
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
