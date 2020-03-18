package es.avalon.dClases10InterfacesEjercicioMejor;

public class Television implements ElementoCasa {

	private boolean estado;

	public Television() {
		super();
		this.estado = false;
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
