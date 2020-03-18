package es.avalon.dClases10InterfacesEjercicioMejor;

public class Ordenador implements ElementoCasa {

	private boolean estado;

	public Ordenador() {
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
		} else  {
			setEstado(false);
		}
		return isEstado();
	}

}
