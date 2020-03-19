package es.avalon.interfaces3;

import java.util.ArrayList;

public class Casa {
	
	private ArrayList<ElementoCasa> listaElementos = new ArrayList<ElementoCasa>();
	
	public ArrayList<ElementoCasa> getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(ArrayList<ElementoCasa> listaElementos) {
		this.listaElementos = listaElementos;
	}

	public void addElemento(ElementoCasa elemento) {
		this.listaElementos.add(elemento);
	}
	
	public void removeElemento(ElementoCasa elemento) {
		this.listaElementos.remove(elemento);
	}
	
	public void encenderTodo() {
		
		for (ElementoCasa e: this.listaElementos) {

			if (e.isEncendido() == false) {
				e.pulsar();
			}
		}
	}

}
