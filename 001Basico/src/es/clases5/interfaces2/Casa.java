package es.clases5.interfaces2;

import java.util.ArrayList;
public interface Casa {
	private ArrayList<ElementoCasa> elemento= new ArrayList<ElementoCasa>();
	

	
	public void addElemento(ElementoCasa e) {
		this.elemento.add(e);
	}
	
	
	

}
