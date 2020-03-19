package es.avalon.InterfacesEjercicioMejor;

import java.util.ArrayList;

public class Casa {

	private ArrayList<ElementoCasa> elementos = new ArrayList<ElementoCasa>();

	public ArrayList<ElementoCasa> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<ElementoCasa> elementos) {
		this.elementos = elementos;
	}

	public void add(ElementoCasa elemento) {
		this.elementos.add(elemento);
	}

	public void remove(Object o) {
		this.elementos.remove(o);
	}

	public void encenderTodo() {

		for (ElementoCasa i : getElementos()) {
			if (!i.isEstado()) {
				i.pulsar();
			}
		}
	}

	public void mostrarEstado(ElementoCasa elemento) {
		if (elemento.isEstado() == true) {
			System.out.println("Esta encendido");
		} else {
			System.out.println("Esta apagado");
		}
	}
	
}
