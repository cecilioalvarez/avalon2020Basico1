package es.avalon.clases10Interfaces3;

import java.util.ArrayList;

public class Casa {
	
	private ArrayList<ElementoCasa> aparatoscasa=new ArrayList<ElementoCasa>();

	public ArrayList<ElementoCasa> getListacasa() {
		return aparatoscasa;
	}

	public void setListacasa(ArrayList<ElementoCasa> listacasa) {
		this.aparatoscasa = listacasa;
	}
	
	//Interface
	public void addElemento(ElementoCasa e) {
		this.aparatoscasa.add(e);
	}
	
	public void encenderTodo() {
		for(ElementoCasa e: this.aparatoscasa) {
			if (!e.isEncendido()) { //La exclamacion lo niega, es lo mismo que poner: if (e.isEncendido()==false) {
				e.pulsar();
			}
		}
	}
	
}
