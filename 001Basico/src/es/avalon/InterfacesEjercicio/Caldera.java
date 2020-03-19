package es.avalon.InterfacesEjercicio;

public class Caldera implements ElementoCasa{
	
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
	public boolean encender() {
		if(isEstado()==false) {
			setEstado(true);
		}return isEstado();
	}

	@Override
	public boolean apagar() {
		if(isEstado()==true) {
			setEstado(false);
		}return isEstado();
	}

}
