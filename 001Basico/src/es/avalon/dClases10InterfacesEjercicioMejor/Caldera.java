package es.avalon.dClases10InterfacesEjercicioMejor;

public class Caldera implements ElementoCasa {

	private boolean estado;

	public Caldera() {
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
