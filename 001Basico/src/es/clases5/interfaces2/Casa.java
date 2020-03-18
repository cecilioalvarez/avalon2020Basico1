package es.clases5.interfaces2;

import java.util.ArrayList;
public class Casa {
	private ArrayList<ElementoCasa> elemento= new ArrayList<ElementoCasa>();
	

	
	public ArrayList<ElementoCasa> getElemento() {
		return elemento;
	}



	public void setElemento(ArrayList<ElementoCasa> elemento) {
		this.elemento = elemento;
	}



	public void addElemento(ElementoCasa e) {
		this.elemento.add(e);
	}
	
	public void encenderTodo() {
		for (ElementoCasa e: this.elemento) {
			if(e.isEncender()==false) {
				e.interruptor();
			}
			
	}
	}
	
	
	

}
