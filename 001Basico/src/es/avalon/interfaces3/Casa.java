package es.avalon.interfaces3;

import java.util.ArrayList;

public class Casa {

	
	private ArrayList<ElementoCasa> elementos= new ArrayList<ElementoCasa>();

	public ArrayList<ElementoCasa> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<ElementoCasa> elementos) {
		this.elementos = elementos;
	}
	//interface
	public void addElemento(ElementoCasa e) {
		
		this.elementos.add(e);
	}
	
	public void encenderTodo() {
		
		for (ElementoCasa e: this.elementos) {
			
			if (e.isEncender()==false) {
				e.pulsar();
			}
		}
	}
}
